package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IndustryLevelJDBC2 {
	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	private static final String SELECT_QUERY = "SELECT * from Employee";
//	private static final String INSERT_QUERY = "INSERT INTO `employee`(`id`, `name`, `email`, `dept`, `salary`) " 
//												+ " VALUES(5, 'Malinga', 'malinga@gmail.com', 'Sales', 30000) ";
	private static final String UPDATE_QUERY = "UPDATE `employee` SET `salary` = `salary` + 5000 WHERE `dept` = 'IT'";
	private static final String DELETE_QUERY = "DELETE FROM `employee` WHERE `name` = 'kaalinga'";
	public static void main(String[] args) {
		
//		Try with Resources
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				
				Statement stmt = con.createStatement();
						
																	)
		{

			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			int i = stmt.executeUpdate(INSERT_QUERY);
//			System.out.println(i + " Rows affected");
			
			
			int j = stmt.executeUpdate(UPDATE_QUERY);
			System.out.println(j + " Rows affected");
			
			int k = stmt.executeUpdate(DELETE_QUERY);
			System.out.println(k + " Rows affected");
			
			ResultSet res = stmt.executeQuery(SELECT_QUERY);
			Jdbc_1.printResultSet(res);
			res.close();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Something is problem!");
		} 
	}

}
