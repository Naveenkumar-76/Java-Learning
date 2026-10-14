package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IndustryLevelJDBC1 {

	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	private static final String SELECT_QUERY = "SELECT * from Employee";
//	private static final String INSERT_QUERY = "INSERT INTO `employee`(`id`, `name`, `email`, `dept`, `salary`) " 
//												+ " VALUES(5, 'Malinga', 'malinga@gmail.com', 'Sales', 30000) ";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		try {

//			1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. Establish the connection
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
//			3. Create a sql statement
			stmt = con.createStatement();
			
//			4. Execute the sql statement
//			int i = stmt.executeUpdate(INSERT_QUERY);
//			System.out.println(i + " Rows affected");
			
			res = stmt.executeQuery(SELECT_QUERY);
			
//			5. Process the results
			
			Jdbc_1.printResultSet(res);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Something is problem!");
		} finally {
			try {
				if(res != null) {
					res.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
