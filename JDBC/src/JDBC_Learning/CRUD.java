package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

////CREATE
//pstmt.executeUpdate();
////READ
//ResultSet rs = pstmt.executeQuery();
////UPDATE
//pstmt.executeUpdate();
////DELETE
//pstmt.executeUpdate();

public class CRUD {
	
	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private static final String UPDATE_QUERY = "UPDATE `employee` SET name = ? WHERE id = ? ";
	private static final String DELETE_QUERY = "DELETE FROM `employee` WHERE id = ?";
	private static final String INSERT_QUERY = "INSERT INTO `employee` (id, name, email, dept, salary) VALUES (?, ?, ?, ?, ?)";
	private static final String SELECT_QUERY = "SELECT * FROM `employee`";

	public static void main(String[] args) {
		
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				PreparedStatement pustmt = con.prepareStatement(UPDATE_QUERY);
				PreparedStatement pdstmt = con.prepareStatement(DELETE_QUERY);
				Statement stmt = con.createStatement();
				PreparedStatement pinstmt = con.prepareStatement(INSERT_QUERY);
				ResultSet res = stmt.executeQuery(SELECT_QUERY);
				){
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			PrepareStmt.display(con);
			
			pustmt.setString(1, "Kaalinga");
			pustmt.setInt(2, 4);
			
			pustmt.executeUpdate();
			
			pdstmt.setInt(1, 5);
			
			pdstmt.executeUpdate();
			
			pinstmt.setInt(1, 5);
			pinstmt.setString(2, "Maalinga");
			pinstmt.setString(3, "Maalinga@gmail.com");
			pinstmt.setString(4, "Media");
			pinstmt.setInt(5, 45000);
			
			pinstmt.executeUpdate();
			
			Jdbc_1.printResultSet(res);
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
