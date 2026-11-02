package Employee_Management;

import java.sql.Date;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private int salary;
    private String email;
    private String phone;
    private Date joiningDate;
    private String status;
    
    public Employee(int id, String name, String dept,
                    int salary, String email, String phone,
                    Date joiningDate, String status) {

        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
        this.joiningDate = joiningDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public String getStatus() {
        return status;
    }
    
    @Override 
    public String toString() {
    	return "Id: " + id + " Name: " + name + " Department: " + dept + " Salary: " + salary 
    			+ " Email: " + email + " Phone: " + phone + " Joining Date: " + joiningDate;
    }
}
