package PracticeJDBCWithEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeTransaction {

	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private static String UPDATE_QUERY = "UPDATE emp SET salary = ? WHERE id = ?";
	private static String SELECT = "SELECT * FROM emp WHERE id = ?";
	
	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		
		try (	
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Scanner sc = new Scanner(System.in);
			) {
			
			con.setAutoCommit(false);
			int id1 = 0, id2 = 0, id3 = 0;
			
			for(int i = 1; i < 3; i++) {
				try (
						PreparedStatement st = con.prepareStatement(UPDATE_QUERY)
					) {
					
					System.out.println("Enter the employee id wants to update: ");
					if(i == 1) {
						id1 = sc.nextInt();
						st.setInt(2, id1);
					} else {
						id2 = sc.nextInt();
						st.setInt(2, id2);
					}
					System.out.println("Enter the employee new salary: ");
					st.setInt(1, sc.nextInt());
					
					System.out.println(1 == st.executeUpdate() ? "1 row updated!" : "Employee not found!");
					
				}
			}
			
			Savepoint s = con.setSavepoint();
			
			int newSalary = 0;
			try (
					PreparedStatement st = con.prepareStatement(UPDATE_QUERY)
				) {
				
				System.out.println("Enter the employee id wants to update: ");
				id3 = sc.nextInt();
				st.setInt(2, id3);
				System.out.println("Enter the employee new salary: ");
				newSalary = sc.nextInt();
				st.setInt(1, newSalary);
				
				System.out.println(1 == st.executeUpdate() ? "1 row updated!" : "Employee not found!");
				
			}
			
			if(newSalary <= 100000) { 
				con.rollback(s);
				System.out.println("Last transaction is not updated!");
			}
			
			con.commit();
			
			printSalary(con, id1);
			printSalary(con, id2);
			printSalary(con, id3);
			
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input!");
		}
		catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("SQL State: " + e.getSQLState());
			System.out.println("Error Code: " + e.getErrorCode());
			e.printStackTrace();
		}
		
	}

	private static void printSalary(Connection con, int id) throws SQLException {
		try (
				PreparedStatement pstmt = con.prepareStatement(SELECT)
			) {
			
			pstmt.setInt(1, id);
			
			try (ResultSet res = pstmt.executeQuery()) {
				if(res.next()) 
					System.out.println("id: " + res.getInt("id") + " salary: " + res.getInt("salary"));
			}
		}
	}

}
