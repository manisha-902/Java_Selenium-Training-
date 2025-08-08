package day4and5;
import java.util.Arrays;
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: Rs." + salary);
    }
}
public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = {
	            new Employee("Srus", 101, 55000),
	            new Employee("Anjali", 102, 72000),
	            new Employee("Vikram", 103, 46000),
	            new Employee("Sneha", 104, 61000)
	        };
		Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Employees sorted by salary (ascending):");
        for (Employee e : employees) {
            e.display();
        }
        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("\nEmployees sorted by salary (descending):");
        for (Employee e : employees) {
            e.display();
        }
    }

}
