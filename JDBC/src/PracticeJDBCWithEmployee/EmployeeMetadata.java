package PracticeJDBCWithEmployee;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeMetadata {

	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	private static final String SELECT_QUERY = "SELECT * FROM emp";
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(SELECT_QUERY);
			) {
		
			DatabaseMetaData dmd = con.getMetaData();
			
			System.out.println("===== DATABASE INFORMATION =====");
			
			System.out.println("Database: " + dmd.getDatabaseProductName());
			System.out.println("Version: " + dmd.getDatabaseProductVersion());
			System.out.println("Driver: " + dmd.getDriverName());
			System.out.println("Driver Version: " + dmd.getDriverVersion());
			System.out.println("URL: " + dmd.getURL());
			System.out.println("User Name: " + dmd.getUserName());
			
			
			System.out.println("===== RESULTSET INFORMATION =====");
			
			ResultSetMetaData rmd = res.getMetaData();
			
			int total_columns = rmd.getColumnCount();
			
			System.out.println("Total column count is " + total_columns);
			
			for(int i = 1; i <= total_columns; i++) {
				System.out.println("Column no: " + i + " Column name: " + rmd.getColumnName(i) + 
						" Column type: " + rmd.getColumnTypeName(i));
			}
			
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
				
		}  catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("SQL State: " + e.getSQLState());
			System.out.println("Error Code: " + e.getErrorCode());
		}
	}

}
