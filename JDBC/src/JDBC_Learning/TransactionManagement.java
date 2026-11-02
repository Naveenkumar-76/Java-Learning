package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Savepoint;
import java.util.Scanner;

public class TransactionManagement {
	
	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private int sender_id, receiver_id;
	
	private static final String SELECT_QUERY = "SELECT * FROM `employee` WHERE id = ?";
	private static final String SENDER_QUERY = "UPDATE `employee` SET salary = salary - ? WHERE id = ? AND salary >= ?";
	private static final String RECEIVER_QUERY = "UPDATE `employee` SET salary = salary + ? WHERE id = ?";
	
	public TransactionManagement(int sender_id, int receiver_id) {
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
	}
	
	public int getSenderId() {
		return sender_id;
	}
	
	public int getRecieverId() {
		return receiver_id;
	}

	public static void main(String[] args) {
		
		try (	Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Scanner sc = new Scanner(System.in);
			){
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			System.out.println("Enter the sender id: ");
			int sender_id = sc.nextInt();
			System.out.println("Enter the reciever id: ");
			int receiver_id = sc.nextInt();
			
			if (sender_id == receiver_id) {
			    System.out.println("Sender and receiver IDs must be different.");
			    return;
			}
			
			TransactionManagement tm = new TransactionManagement(sender_id, receiver_id);
			
			System.out.println("Before transaction user's Details: ");
		
			System.out.print("Sender ");
			String sender_name = tm.printUserDetails(con, sender_id);
			
			System.out.print("Receiver ");
			String receiver_name = tm.printUserDetails(con, receiver_id);
			
			con.setAutoCommit(false);
			
			System.out.print("Enter the Amount of transaction: ");
			int send_amount = sc.nextInt();
			if (send_amount <= 0) {
			    System.out.println("Amount must be greater than zero.");
			    con.rollback();
			    return;
			}
			int receive_amount = send_amount;
			sc.nextLine();
			
			System.out.println("Hey " + sender_name + " for your conformation to send the money " + send_amount 
					+ " to user " + receiver_name + " enter 'yes', otherwise 'no': ");
			
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("yes")) {
				
//				Savepoint s = con.setSavepoint();
				
				try (PreparedStatement pstmt1 = con.prepareStatement(SENDER_QUERY);) {
					pstmt1.setInt(1, send_amount);
					pstmt1.setInt(2, sender_id);
					pstmt1.setInt(3, send_amount);
					int senderChanges = pstmt1.executeUpdate();
	
					if (senderChanges != 1) {
					    con.rollback();
					    System.out.println("Transaction failed.");
					    return;
					}
				}
				
				int response = tm.receiverBankResponse(con, sc, receive_amount, receiver_name);
				if(response == 1) {
					con.commit();
					System.out.println("Transaction successful: ");
					System.out.print("Sender ");
					tm.printUserDetails(con, sender_id);
					
					System.out.print("Receiver ");
					tm.printUserDetails(con, receiver_id);
				} else {
					con.rollback();
					System.out.println("Transaction Failed: ");
					System.out.print("Sender ");
					tm.printUserDetails(con, sender_id);
					
					System.out.print("Receiver ");
					tm.printUserDetails(con, receiver_id);
				}
				
			} else {
				System.out.println("Transcation cancelled!");
			}
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Enter the valid input!");
		}
		
	}
	
	public String printUserDetails(Connection con, int id)
	        throws SQLException {
		
		String name = "";

	    try (PreparedStatement pstmt =
	             con.prepareStatement(SELECT_QUERY)) {

	        pstmt.setInt(1, id);

	        try (ResultSet res = pstmt.executeQuery()) {
	            if (res.next()) {
	                System.out.println(
	                    "Details: id: " + res.getInt("id")
	                    + ", Name: " + res.getString("name")
	                    + ", Balance: " + res.getInt("salary"));
	                name = res.getString("name");
	            }
	        }
	    }

	    return name;
	    
	}
	public int receiverBankResponse(Connection con, Scanner sc, int receive_amount, String receiver_name) throws SQLException {
		
		System.out.println("Hey " + receiver_name + " enter 'yes' do you want to accept the transaction, if you have technical issues then enter 'no': ");
		
		String choice = sc.nextLine();
		int receiver_changes = 0;
		
		if(choice.equalsIgnoreCase("yes")) {
			try (PreparedStatement pstmt2 = con.prepareStatement(RECEIVER_QUERY)){
				pstmt2.setInt(1, receive_amount);
				pstmt2.setInt(2, receiver_id);
				
				receiver_changes = pstmt2.executeUpdate();
				
				if (receiver_changes != 1) {
				    return 0;
				}
				
				return receiver_changes;
			}
		} else {
			System.out.println("Receiver Denied!");
			return receiver_changes;
		}
	}
}
