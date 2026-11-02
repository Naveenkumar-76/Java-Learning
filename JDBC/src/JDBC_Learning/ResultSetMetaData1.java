package JDBC_Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaData1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user_name = System.getenv("User_Name");
		String password = System.getenv("Pass_word");
		
		String query = "SELECT * FROM emp";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user_name, password);
			
//			ResultSet.TYPE_SCROLL_SENSITIVE is give the option cursor will move to anywhere in forward direction
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 0);
			
			ResultSet result = stmt.executeQuery(query);
			
//			result cursor will go to the first coolumn, it is start of the cursor
			result.first();
			
			System.out.println(result.getInt("id") + " " + result.getString("name") + " "
					+ result.getString("desig") + " " + result.getInt("salary"));
			
//			Cursor will go to the exactly given line
			result.absolute(3);
			
			System.out.println(result.getInt("id") + " " + result.getString("name") + " "
					+ result.getString("desig") + " " + result.getInt("salary"));
			
//			ResultSetMetaData = result.getMetaData() will give to know what is column name, type and how many columns are have the database of the table.
			ResultSetMetaData metaData = result.getMetaData();
			
			for(int i = 1; i <= metaData.getColumnCount(); i++) {
				System.out.println(metaData.getColumnName(i) + " " + metaData.getColumnTypeName(i));
			}
			
//			when we know the name and type we will acces the data
			result.beforeFirst();
			while(result.next()) {
				System.out.println(result.getInt("id") + " " + result.getString("name") + " "
						+ result.getString("desig") + " " + result.getInt("salary"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
