package day3;

public class EmployeeIn {
	protected String name;
    protected int id;
    protected double salary;

    public EmployeeIn(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs. " + salary);
    }
}
class Manager extends EmployeeIn {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends EmployeeIn {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}