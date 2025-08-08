package day3;
import java.util.Scanner;
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose role:\n1. Manager\n2. Developer");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        EmployeeIn emp;
        
        if (choice == 1) {
            System.out.print("Enter Team Size: ");
            int teamSize = sc.nextInt();
            emp = new Manager(name, id, salary, teamSize);
        } else if (choice == 2) {
            sc.nextLine(); 
            System.out.print("Enter Programming Language: ");
            String language = sc.nextLine();
            emp = new Developer(name, id, salary, language);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        emp.displayDetails();
        sc.close();
	}

}
