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


public class EmployeeSearch {

	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private static final String SEARCH_DEPT = "SELECT * FROM emp WHERE dept = ?";
	private static final String SALARY_RANGE = "SELECT * FROM emp WHERE salary BETWEEN ? AND ?";
	private static final String SEARCH_DATE = "SELECT * FROM emp WHERE joining_date > ?";
	private static final String SELECT_QUERY = "SELECT * FROM emp";
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Scanner sc = new Scanner(System.in);
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet res = stmt.executeQuery(SELECT_QUERY);
			) {
			
			departmentSearch(con, sc);
			
			salaryRangeSearch(con, sc);
			
			dateSearch(con, sc);
			
			res.first();
			
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
			
			res.last();
			
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
			
			res.absolute(3);
			
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
			
			res.relative(2);
			
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
			
			res.previous();
			
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
			
			res.last();
			System.out.println(res.getRow() + " rows");
			
			if(res.isFirst())
				System.out.println("ResultSet cursor in first row");
			else if(res.isLast()) 
				System.out.println("ResultSet cursor in last row");
			else 
				System.out.println("ResultSet cursor some where");
				
				
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input!");
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("SQL State: " + e.getSQLState());
			System.out.println("Error Code: " + e.getErrorCode());
		}
	}
	private static void dateSearch(Connection con, Scanner sc) throws SQLException {
		try (
				PreparedStatement stmt = con.prepareStatement(SEARCH_DATE);
			) {
			
			System.out.println("Enter the date(YEAR MONTH DAY): ");
			LocalDate join_date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
			stmt.setDate(1, Date.valueOf(join_date));
			
			try (ResultSet res = stmt.executeQuery()) {
				
				int count = 0;
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
					count++;
				}
				
				if(count == 0) 
					System.out.println("Employees not found!");
			}
			
		}
	}
	private static void salaryRangeSearch(Connection con, Scanner sc) throws SQLException {
		
		try (
				PreparedStatement stmt = con.prepareStatement(SALARY_RANGE);
			) {
			
			System.out.println("Enter the minimum salary: ");
			stmt.setInt(1, sc.nextInt());
			System.out.println("Enter the maximum salary: ");
			stmt.setInt(2, sc.nextInt());
			
			try (ResultSet res = stmt.executeQuery()) {
				
				int count = 0;
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
					count++;
				}
				
				if(count == 0) 
					System.out.println("Employees not found!");
			}
			
		}
	}
	public static void departmentSearch(Connection con, Scanner sc) throws SQLException {
		
		try (
				PreparedStatement stmt = con.prepareStatement(SEARCH_DEPT);
			) {
			
			System.out.println("Enter the department: ");
			stmt.setString(1, sc.nextLine());
			
			try (ResultSet res = stmt.executeQuery()) {
				
				int count = 0;
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
					count++;
				}
				
				if(count == 0) 
					System.out.println("Employees not found!");
			}
			
		}
		
	}

}
