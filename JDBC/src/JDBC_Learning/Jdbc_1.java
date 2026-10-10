package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/adjava", userName = System.getenv("User_Name"), password = System.getenv("Pass_word");
//		String query = "INSERT INTO Employee(id, name, email, dept, salary) " +
//						"VALUES(2, 'naveen', 'naveen@gmail.com', 'Sales', 35000) ";
		try {
			
//			1. Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is loaded!");
			
//			2. Establish the connection
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is established!");
			
//			3. Create a sql statement
			Statement stmt = con.createStatement();
			System.out.println("Statement created successfully!");
			
//			Update or Insert Values
//			stmt.executeUpdate(query);
			
//			4. Execute the sql statement 
			ResultSet result = stmt.executeQuery("SELECT * from Employee");
			
			printResultSet(result);
			 
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void printResultSet(ResultSet result) throws SQLException{
		System.out.println("-------------------------------------------------");
		while(result.next()) {
			System.out.printf("%d %-10s %-20s %-8s %d\n", result.getInt("id"),
			result.getString("name"), 
			result.getString("email"),
			result.getString("dept"),
			result.getInt("salary"));
		}
		System.out.println("-------------------------------------------------");
	}

}
