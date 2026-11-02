package Employee_Management;

import java.util.List;

public interface EmployeeDAO {

	boolean insertEmployee(Employee emp);
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();
	boolean updateEmployee(Employee emp);
	boolean deleteEmployee(int id);
}
