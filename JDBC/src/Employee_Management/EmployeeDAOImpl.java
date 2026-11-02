package Employee_Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Override
	public boolean insertEmployee(Employee emp) {
		
		int i = 0;
		
		try (Connection con = EmployeeConnectionFactory.requestConnection()) {
			
			String query = "INSERT INTO emp (id, name, dept, salary, email, phone, joining_date, status)"
					+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			try (PreparedStatement pstmt = con.prepareStatement(query)) {
				
				pstmt.setInt(1, emp.getId());
				pstmt.setString(2, emp.getName());
				pstmt.setString(3, emp.getDept());
				pstmt.setInt(4, emp.getSalary());
				pstmt.setString(5, emp.getEmail());
				pstmt.setString(6, emp.getPhone());
				pstmt.setDate(7, emp.getJoiningDate());
				pstmt.setString(8, emp.getStatus());
				
				i = pstmt.executeUpdate();
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not available!");
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage() + " SQL state: " + e.getSQLState()
			+ " SQl Error Code: " + e.getErrorCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i == 1 ? true : false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Employee emp = null;
		
		try (Connection con = EmployeeConnectionFactory.requestConnection();){
			
			String query = "SELECT * FROM emp WHERE id = ?";
			
			try (PreparedStatement pstmt = con.prepareStatement(query);) {
				pstmt.setInt(1, id);
				
				try (ResultSet res = pstmt.executeQuery();) {
					
					if(res.next()) {
						emp = new Employee(
								res.getInt(1), res.getString(2), res.getString(3), res.getInt(4),
								res.getString(5), res.getString(6), res.getDate(7), res.getString(8)	
							);
					} else {
						System.out.println("Employee not found!");
					}
					
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not available!");
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage() + " SQL state: " + e.getSQLState()
			+ " SQl Error Code: " + e.getErrorCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;

	}

	@Override
	public List<Employee> getAllEmployees() {
			
		ArrayList<Employee> empList = new ArrayList<>();
		
			try (Connection con = EmployeeConnectionFactory.requestConnection();) {
				
				String query = "SELECT * FROM emp";
				
				try (PreparedStatement pstmt = con.prepareStatement(query);) {
					try (ResultSet res = pstmt.executeQuery();) {
						while(res.next()) {
							Employee e = 
									new Employee(
										res.getInt(1), res.getString(2), res.getString(3), res.getInt(4),
										res.getString(5), res.getString(6), res.getDate(7), res.getString(8)	
									);
							empList.add(e);
						}
					}
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("Class is not available!");
			} catch (SQLException e) {
				System.out.println("Message: " + e.getMessage() + " SQL state: " + e.getSQLState()
				+ " SQl Error Code: " + e.getErrorCode());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return empList;
	}


	@Override
	public boolean updateEmployee(Employee emp) {
	
	    String query = "UPDATE emp SET name = ?, dept = ?, salary = ?, "
	            + "email = ?, phone = ? WHERE id = ?";
	
	    try (Connection con = EmployeeConnectionFactory.requestConnection();
	         PreparedStatement pstmt = con.prepareStatement(query)) {
	
	        pstmt.setString(1, emp.getName());
	        pstmt.setString(2, emp.getDept());
	        pstmt.setInt(3, emp.getSalary());
	        pstmt.setString(4, emp.getEmail());
	        pstmt.setString(5, emp.getPhone());
	        pstmt.setInt(6, emp.getId());
	
	        return pstmt.executeUpdate() > 0;
	
	    } catch (ClassNotFoundException e) {
	        System.out.println("JDBC driver class not found!");
	    } catch (SQLException e) {
	        System.out.println("Message: " + e.getMessage()
	                + " SQL State: " + e.getSQLState()
	                + " SQL Error Code: " + e.getErrorCode());
	    } catch (Exception e) {
			e.printStackTrace();
		}
	
	    return false;
	}


	@Override
	public boolean deleteEmployee(int id) {

		
		try (Connection con = EmployeeConnectionFactory.requestConnection()) {
			
			String query = "DELETE FROM emp WHERE id = ?";
			
			try (PreparedStatement pstmt = con.prepareStatement(query)) {
				
				pstmt.setInt(1, id);
				
				return pstmt.executeUpdate() > 0;
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not available!");
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage() + " SQL state: " + e.getSQLState()
			+ " SQl Error Code: " + e.getErrorCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
