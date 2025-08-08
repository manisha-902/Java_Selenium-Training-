package day7and8;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
	private String name;
	private int age;
	private String disease;

	public Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void displayDetails() {
		System.out.println("Name:" + name + " \nAge :" + age + "\nDisease:" + disease);
	}
}

public class HospitalOPDManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ArrayList<Patient> patientList = new ArrayList<>();

			Scanner scanner = new Scanner(System.in);
			patientList.add(new Patient("Vinay Bhat", 45, "fever"));
			patientList.add(new Patient("Sonali Langar", 40, "Cough"));
			patientList.add(new Patient("Renu Sai", 30, "Pain"));
			while (true) {
				System.out.println("\n Hospital OPD Manu :");
				System.out.println("1. Add New Patient:");
				System.out.println("2. Display All Pateints");
				System.out.println("3. Get Patient by Index:");
				System.out.println("4. Update Patient Disease:");
				System.out.println("5. Remove Patient by Index:");
				System.out.println("6. Remove Patient by Name:");
				System.out.println("7. Check if Patient Exists:");
				System.out.println("8. Show Total Patients:");
				System.out.println("9. Clear All Records:");
				System.out.println("10. Find First/Last Index of a Patient:");
				System.out.println("11. Check if List is Empty");
				System.out.println("12. Exit");
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
					System.out.println("Enter disease:");
					String disease = scanner.nextLine();
					patientList.add(new Patient(name, age, disease));
					System.out.println("Patient added successfully !");
					break;
				case 2:
					System.out.println("All Registered Patients:");
					for (Patient p : patientList) {
						p.displayDetails();
					}
					break;
				case 3:
					System.out.println("Enter Index:");
					int idx = scanner.nextInt();
					scanner.nextLine();
					if (idx >= 0 && idx < patientList.size()) {
						System.out.println("Patient at index" + idx);
					} else {
						System.out.println("Invalid Index.");
					}
					break;
				case 4:
					System.out.println("Enter index of patient to update: ");
					int updateidx = scanner.nextInt();
					scanner.nextLine();
					if (updateidx >= 0 && updateidx < patientList.size()) {
						System.out.print("Enter new disease: ");
						String newDisease = scanner.nextLine();
						patientList.get(updateidx).setDisease(newDisease);
						System.out.println("Disease updated.");
					} else {
						System.out.println("invalid index.");
					}
					break;
				case 5:
					System.out.print("Enter index to remove: ");
					int removeidx = scanner.nextInt();
					scanner.nextLine();
					if (removeidx >= 0 && removeidx < patientList.size()) {
						patientList.remove(removeidx);
						System.out.println("Patient removed.");
					} else {
						System.out.println("invalid Index.");
					}
					break;
				case 6:
					System.out.println("Enter name to remove: ");
					String removeName = scanner.nextLine();
					boolean removed = false;
					for (int i = 0; i < patientList.size(); i++) {
						if (patientList.get(i).getName().equalsIgnoreCase(removeName)) {
							patientList.remove(i);
							System.out.println("Patient removed.");
							removed = true;
							break;
						}
					}
					if (!removed) {
						System.out.println("Patient not found.");
					}
					break;
				case 7:
					System.out.print("Enter name to search: ");
					String searchName = scanner.nextLine();
					boolean exists = false;
					for (Patient p : patientList) {
						if (p.getName().equalsIgnoreCase(searchName)) {
							System.out.println("Patient exist");
							exists = true;
							break;
						}
					}
					if (!exists) {
						System.out.println("Patient not found.");
					}
					break;
				case 8:
					System.out.println("Total Patients:" + patientList.size());
					break;
				case 9:
					patientList.clear();
					System.out.println("All patient records cleared.");
					break;
				case 10:
					System.out.print("Enter Patient name to find: ");
					String findName = scanner.nextLine();
					int first = -1, last = -1;
					for (int i = 0; i < patientList.size(); i++) {
						if (patientList.get(i).getName().equalsIgnoreCase(findName)) {
							if (first == -1)
								first = i;
							last = i;
						}
					}
					if (first != -1) {
						System.out.println("First index:" + first + ", Last index: " + last);
					} else {
						System.out.println("Patient not found.");
					}
					break;
				case 11:
					System.out.println(patientList.isEmpty() ? "Patient list is empty." : "Patient list has records.");
					break;
				case 12:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice!");
				}
			}
		}
	}
}