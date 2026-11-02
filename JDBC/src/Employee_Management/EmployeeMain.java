package Employee_Management;

import java.sql.Date;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		
		int n = 0;
		try {
			do {
				System.out.println("Menu:"
						+ "\n1. Retrieve all employees"
						+ "\n2. Retrieve employe by id"
						+ "\n3. Insert emloyee"
						+ "\n4. Update employee"
						+ "\n5. Delete employee"
						+ "\n6. Exit"
						);
				
				System.out.println("Enter the option: ");
				
				n = sc.nextInt();
				
				switch(n) {
					case 1:
						
						List<Employee> employee = employeeDAOImpl.getAllEmployees();
						
						for(Employee e : employee ) {
							System.out.println(e);
						}
						
						break;
						
					case 2:
						
						System.out.println("Enter the employe id: ");
						int id = sc.nextInt();
						Employee empById = employeeDAOImpl.getEmployeeById(id);
						if(empById != null) 
							System.out.println(empById);
						
						break;
						
					case 3:
						
						System.out.println("Enter the employee id: ");
						int empId = sc.nextInt(); 
						sc.nextLine();
						System.out.println("Enter the employee name: ");
						String name = sc.nextLine();
						System.out.println("Enter the employee department: ");
						String dept = sc.nextLine();
						System.out.println("Enter the employee salary: ");
						int salary = sc.nextInt();
						if(salary <= 0) {
							System.out.println("Please enter valid salary(0 < salary)!");
							salary = sc.nextInt();
							if(salary <= 0)
							throw new IllegalArgumentException();
						}
						sc.nextLine();
						System.out.println("Enter the employee email: ");
						String email = sc.nextLine();
						System.out.println("Enter the employee phone: ");
						String phone = sc.nextLine();
						System.out.println("Enter the employee joining date(Year Month Day): ");
						LocalDate join_date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
						sc.nextLine();
						System.out.println("Enter the employee status(ACTIVE/INACTIVE): ");
						String status = sc.nextLine();
						
						Employee em = new Employee(empId, name, dept, salary, email, phone, Date.valueOf(join_date), status);
						
						if(employeeDAOImpl.insertEmployee(em)) 
							System.out.println("Employee inserted successfully!");
						else 
							System.out.println("Database doesn't respond!");
						
						break;

					case 4:
					    System.out.println("Enter the employee ID: ");
					    int empid = sc.nextInt();
					    sc.nextLine();
					
					    Employee empupdate = employeeDAOImpl.getEmployeeById(empid);
					
					    if (empupdate != null) {
					
					        System.out.println("Enter the new name: ");
					        String name1 = sc.nextLine();
					
					        System.out.println("Enter the new department: ");
					        String dept1 = sc.nextLine();
					
					        System.out.println("Enter the new salary: ");
					        int salary1 = sc.nextInt();
					        sc.nextLine();
					
					        if (salary1 <= 0) {
					            System.out.println("Salary must be positive!");
					            break;
					        }
					
					        System.out.println("Enter the new email: ");
					        String email1 = sc.nextLine();
					
					        System.out.println("Enter the new phone: ");
					        String phone1 = sc.nextLine();
					
					        Employee updatedEmployee = new Employee(
					                empupdate.getId(),
					                name1,
					                dept1,
					                salary1,
					                email1,
					                phone1,
					                empupdate.getJoiningDate(),
					                empupdate.getStatus()
					        );
					
					        if (employeeDAOImpl.updateEmployee(updatedEmployee)) {
					            System.out.println("Employee updated successfully!");
					        } else {
					            System.out.println("Employee not updated!");
					        }
					    } else {
					        System.out.println("Employee not found!");
					    }
				
					    break;
 						
					case 5: 
						
						System.out.println("Enter the employe id: ");
						int eid = sc.nextInt();
						if(employeeDAOImpl.deleteEmployee(eid)) {
							System.out.println("Employee deleted sucessfully!");
						} else {
							System.out.println("Employee not found!");
						}
						
						break;
						
					case 6:
						System.out.println("Exited!");
						break;
						
					default: System.out.println("Please enter the valid input!");
				}
				
			} while(n != 6);
			
		} catch (InputMismatchException e) {
			System.out.println("Input should be integer!");
		} catch (IllegalArgumentException e) {
			System.out.println("Salary should be positive!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
