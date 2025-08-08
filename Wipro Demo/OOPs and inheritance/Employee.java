package day3;

public class Employee {
	private String name;
	private String id;
	private double salary;

	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setSalary(double salary) {
        this.salary = salary;
    }
	
	public double getSalary() {
        return salary;
    }

	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Salary: Rs. " + salary);
	}
}
