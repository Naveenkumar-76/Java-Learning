package PracticeJDBCWithEmployee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCRUD {
	
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private static final String INSERT_QUERY = "INSERT INTO emp(id, name, dept, salary, email, phone, joining_date, status) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SELECT_QUERY = "SELECT * FROM emp";
	private static String SELECT_WITH_USER = "SELECT * FROM emp WHERE id = ?";
	private static String UPDATE_QUERY = "UPDATE emp SET salary = ? WHERE id = ?";
	private static String DELETE_QUERY = "DELETE FROM emp WHERE id = ?";	
	
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
			
			
			insertMethod(con, sc);
			
			printDetails(con);
			
			printWithInput(con, sc);
			
			updateDetails(con, sc);
			
			try (
					PreparedStatement st = con.prepareStatement(DELETE_QUERY)
				) {
				
				System.out.println("Enter the employee id wants to delete: ");
				st.setInt(1, sc.nextInt());
				
				System.out.println(1 == st.executeUpdate() ? "1 row updated!" : "Employee not found!");
				
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input!");
		}
		catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("SQL State: " + e.getSQLState());
			System.out.println("Error Code: " + e.getErrorCode());
		}
		
	}
	
	private static void updateDetails(Connection con, Scanner sc) throws SQLException {
		
		try (	
				PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
			) {
			
			System.out.println("Enter the employee id wants to update: ");
			pstmt.setInt(2, sc.nextInt());
			System.out.println("Enter the new salary: ");
			pstmt.setInt(1, sc.nextInt());
			
			System.out.println(1 == pstmt.executeUpdate() ? "1 row updated!" : "Employee not found!");
		}
		
	}

	public static void insertMethod(Connection con, Scanner sc) throws SQLException {
		
		try (PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
			
			for(int i = 1; i < 3; i++) {
				
				System.out.println("Enter the employee id: ");
				pstmt.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the employee name: ");
				pstmt.setString(2, sc.nextLine());
				System.out.println("Enter the employee department: ");
				pstmt.setString(3, sc.nextLine());
				System.out.println("Enter the employee salary: ");
				pstmt.setInt(4, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the employee email: ");
				pstmt.setString(5, sc.nextLine());
				System.out.println("Enter the employee phone number: ");
				pstmt.setString(6, sc.nextLine());
				System.out.println("Enter the employee joining date(Year month date): ");
				LocalDate jd = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
				pstmt.setDate(7, Date.valueOf(jd));
				sc.nextLine();
				System.out.println("Enter the employee status: ");
				pstmt.setString(8, sc.nextLine());
				
				pstmt.addBatch();
				
			}
			
			int[] rows = pstmt.executeBatch();
			System.out.println(rows.length + " rows affcted!");
		
		}

	}
	
	public static void printDetails(Connection con) throws SQLException {
		
		try (
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(SELECT_QUERY);
			) {
		
			while(res.next()) {
				System.out.println(
						"ID: " + res.getInt("id") +
						"\nName: " + res.getString("name") +
						"\nDepartment: " + res.getString("dept") +
						"\nSalary: " + res.getInt("salary") +
						"\nEmail: " + res.getString("email") +
						"\nPhone: " + res.getString("phone") +
						"\nJoining Date: " + res.getDate("joining_date") +
						"\nStatus: " + res.getString("status")
				);
				System.out.println("-------------------------------------------------------");
			}
		}
	}
	
	public static void printWithInput(Connection con, Scanner sc) throws SQLException {
		
		try (
				PreparedStatement stmt = con.prepareStatement(SELECT_WITH_USER);
			) {
		
			System.out.println("Enter the user id: ");
			stmt.setInt(1, sc.nextInt());
			
			try (
					ResultSet res = stmt.executeQuery(); 
				) {
			
				if(res.next()) {
					System.out.println(
							"ID: " + res.getInt("id") +
							"\nName: " + res.getString("name") +
							"\nDepartment: " + res.getString("dept") +
							"\nSalary: " + res.getInt("salary") +
							"\nEmail: " + res.getString("email") +
							"\nPhone: " + res.getString("phone") +
							"\nJoining Date: " + res.getDate("joining_date") +
							"\nStatus: " + res.getString("status")
					);
					System.out.println("-------------------------------------------------------");
				} else 
					System.out.println("Employee not found!");
			}
		}
	}

}
