package Employee_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnectionFactory {

	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	static public Connection requestConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
		return con;
		
	}
}
