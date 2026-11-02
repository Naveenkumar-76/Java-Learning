package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStmt {
	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	private static final String SELECT_QUERY = "SELECT * from Employee";
	private static final String INSERT_QUERY = "INSERT INTO `employee`(`id`, `name`, `email`, `dept`, `salary`) " 
												+ " VALUES(?, ?, ?, ?, ?) ";
//	private static final String UPDATE_QUERY = "UPDATE `employee` SET `salary` = `salary` + ? WHERE `dept` = '?'";
//	private static final String DELETE_QUERY = "DELETE FROM `employee` WHERE `name` = 'kaalinga'";
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet res = null;
		Scanner sc = new Scanner(System.in);
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			stmt = con.createStatement();
			
			display(con);
			
			pstmt = con.prepareStatement(INSERT_QUERY);
			
			System.out.println("Enter the employee id: ");
			pstmt.setInt(1, sc.nextInt());
			sc.next();
			System.out.println("Enter the employee name: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter the employee email: ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter the employee dept: ");
			pstmt.setString(4, sc.nextLine());
			System.out.println("Enter the employee salary: ");
			pstmt.setInt(5, sc.nextInt());
			
			int i = pstmt.executeUpdate();
			System.out.println(i + " Rows affected");
			
			res = stmt.executeQuery(SELECT_QUERY);
			
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
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void display(Connection con) throws SQLException {
		
		Statement stmt = con.createStatement();
		
		ResultSet res = stmt.executeQuery(SELECT_QUERY);
		
		Jdbc_1.printResultSet(res);
	}
}
