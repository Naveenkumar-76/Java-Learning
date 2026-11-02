package PracticeJDBCWithEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.sql.CallableStatement;

public class EmployeeCallable {

	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		
		try (	
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Scanner sc = new Scanner(System.in);
				CallableStatement cs = con.prepareCall("{call employee_salary(?, ?, ?)}")
			) {
			
			System.out.println("Enter the employee id: ");
			cs.setInt(1, sc.nextInt());
			
			System.out.println("Enter the employee new salary: ");
			cs.setInt(2, sc.nextInt());
			
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute();
			
			int out = cs.getInt(3);
			if(out == 1) {
				System.out.println("Salary updated successfully");
			} else {
				System.out.println("Employee not found");
			}
			
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

}
