package ass1;

public class Employee {
	static String companyName = "WIPRO";
    String employeeName;
    double salary;
    
    Employee(String name, double salary) {
        this.employeeName = name;
        this.salary = salary;
    }
    
    void calculateNetSalary() {
        double tax = salary * 0.1; // local variable
        double netSalary = salary - tax;
        System.out.println("Employee: " + employeeName);
        System.out.println("Net Salary: Rs. " + netSalary);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Sneha", 60000);
        emp.calculateNetSalary();
	}

}
