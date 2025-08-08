package day7and8;

import java.util.ArrayList;
import java.util.Scanner;

class Patientdetails {
	private String name;
	private int age;
	private String gender;
	private String disease;
	private String assignedDoctor;

	public Patientdetails(String name, int age, String gender, String disease, String assignedDoctor) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
		this.assignedDoctor = assignedDoctor;
	}

	public String getName() {
		return name;
	}

	public void displayDetails() {
		System.out.println("Name:" + name + " \nAge :" + age + " \nGender :" + gender + "\nDisease:" + disease + " \nAssigned Doctor :" + assignedDoctor);
	}
}

public class HospitalOPD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Patientdetails> patientList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		patientList.add(new Patientdetails("Vinay Bhat", 45,"Male", "fever","Dr.Smith"));
		patientList.add(new Patientdetails("Sonali Langar", 40,"female", "Cough","Dr.Bob"));
		patientList.add(new Patientdetails("Renu Sai", 30,"female", "Pain","Dr.Roy"));
		while (true) {
			System.out.println("\n Hospital OPD Manu :");
			System.out.println("1. Add New Patient:");
			System.out.println("2. Display All Pateints");
			System.out.println("3. Search Patient by Name");
			System.out.println("4. Search Patient by Age Range");
			System.out.println("5. Display Patients by Doctor");
			System.out.println("6. Exit");
			System.out.println("Enter your choice :");
			int choice = scanner.nextInt();

			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter patient name :");
				String name = scanner.nextLine();
				System.out.println("Enter patient age:");
				int age = scanner.nextInt();
				scanner.nextLine(); // consume newline
				System.out.println("Enter gender:");
				String gender = scanner.nextLine();
				System.out.println("Enter disease:");
				String disease = scanner.nextLine();
				System.out.println("Enter AssignedDoctor:");
				String assignedDoctor = scanner.nextLine();
				String doctor;
				switch(disease.toLowerCase()) {
				case"cold":
				case"fever":
				case"flu":
					doctor = "Dr";
				}
				patientList.add(new Patientdetails(name, age, gender, disease, assignedDoctor));
				System.out.println("Patient added successfully !");
				break;
			case 2:
				System.out.println("All Registered Patients:");
				for (Patientdetails p : patientList) {
					p.displayDetails();
				}
				break;
			case 3:
				System.out.println("Enter patient name to search:");
				String searchName = scanner.nextLine();
				boolean found = false;

				for (Patientdetails p : patientList) {
					if (p.getName().equalsIgnoreCase(searchName)) {
						p.displayDetails();
						found = true;
					}
				}
				if (!found) {
					System.out.println("No patient found with name :" + searchName);
				}
				break;

			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
