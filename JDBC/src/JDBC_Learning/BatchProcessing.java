package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessing {

	private static final String URL = "jdbc:mysql://localhost:3306/adjava";
	private static final String USER_NAME = System.getenv("User_Name");
	private static final String PASSWORD = System.getenv("Pass_word");
	
	private static final String INSERT_QUERY = "INSERT INTO `employee` (id, name, email, dept, salary) VALUES (?, ?, ?, ?, ?)";
	private static final String SELECT_QUERY = "SELECT * FROM `employee`";
	
	public static void main(String[] args) {

		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement stmt = con.createStatement();
				PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
				Scanner sc = new Scanner(System.in);
				
				){
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			PrepareStmt.display(con);
			
//			Set the auto commit to ensure whether it is correctly inserting data into database
//			Acid properties
			con.setAutoCommit(false);
			
			System.out.print("Enter the no.of Employee details you want to enter: ");
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				
				System.out.print("Enter the employee id: ");
				pstmt.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.print("Enter the employee name: ");
				pstmt.setString(2, sc.nextLine());
				System.out.print("Enter the employee email: ");
				pstmt.setString(3, sc.nextLine());
				System.out.print("Enter the employee dept: ");
				pstmt.setString(4, sc.nextLine());
				System.out.print("Enter the employee salary: ");
				pstmt.setInt(5, sc.nextInt());
				
//				addBatch() is will add the all set of executing queries in file format.
				pstmt.addBatch();
			}
			
//			executeBatch() is will execute all set of queries.
			 int[] results = pstmt.executeBatch();

             System.out.println(
                 "Batch executed. Result entries: "
                 + results.length
             );
			
//			whether all estimated steps executes then commit the processes.
             con.commit();
             
             try (ResultSet res = stmt.executeQuery(SELECT_QUERY)) {
                 while (res.next()) {
                     System.out.printf(
                         "%d %-10s %-20s %-10s %d%n",
                         res.getInt("id"),
                         res.getString("name"),
                         res.getString("email"),
                         res.getString("dept"),
                         res.getInt("salary")
                     );
                 }
             }
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}

}
