package day3;

public class EmployeeMainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Employee emp = new Employee("Manisha", "EMP101", 50000);
	     Department dept = new Department();
	        dept.setDeptName("Software Development");
	        dept.setLocation("Bangalore");
	        
	        emp.displayDetails();
	        System.out.println("------------------------");
	        dept.displayDetails();
	        
	    }
	}


