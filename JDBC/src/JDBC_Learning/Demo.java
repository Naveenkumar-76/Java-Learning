package JDBC_Learning;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user_name = System.getenv("User_Name");
		String password = System.getenv("Pass_word");
		
		String query = "SELECT * FROM emp";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class successfully loaded!");
			
			Connection con = DriverManager.getConnection(url, user_name, password);
			System.out.println("Connection successfully established!");
			
			Statement stmt = con.createStatement();
			System.out.println("Created statement suceessfully!");
			
			ResultSet result = stmt.executeQuery(query);
			System.out.println("Executed query successfully!");
			
			while(result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + 
						" " + result.getString(3) + " " + result.getInt(4));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
