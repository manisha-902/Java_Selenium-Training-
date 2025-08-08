package day9;

import java.util.*;

class Patients {
	int id;
	String name;

	public Patients(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
}

public class HospitalQueueSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Patients> patientSet = new HashSet<>();
		int choice;
		do {
			System.out.println("\n--- Hospital Registration System ---");
			System.out.println("1. Register Patient");
			System.out.println("2. View Registered Patients");
			System.out.println("3. Remove patient by ID");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				Patients newPatient = new Patients(id, name);
				if (patientSet.contains(newPatient)) {
					System.out.println("Patient with ID " + id + " is already registered.");
				} else {
					patientSet.add(newPatient);
					System.out.println("Patient registered successfully.");
				}
				break;
			case 2:
				if (patientSet.isEmpty()) {
					System.out.println("No patients registered yet.");
				} else {
					System.out.println("Registered Patients:");
					for (Patients p : patientSet) {
						System.out.println(p);
					}
				}
				break;
			case 3:
				System.out.print("Enter Patient ID to remove: ");
				int removeId = sc.nextInt();
				sc.nextLine();

				boolean removed = patientSet.removeIf(p -> p.id == removeId);

				if (removed) {
				    System.out.println("Patient with ID " + removeId + " removed.");
				} else {
				    System.out.println("Patient with ID " + removeId + " not found.");
				}
			case 4:
				System.out.println("Exiting system.");
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 4);
		sc.close();
	}
}

        