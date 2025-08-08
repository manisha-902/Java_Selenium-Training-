package day9;

import java.util.*;

class Patient {
	int id;
	String name;

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
}

public class HospitalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Patient> patientQueue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nHospital Patient Queue System:");
			System.out.println("1. Add New Patient (Normal)");
			System.out.println("2. Add Emergency Patient");
			System.out.println("3. Cancel Appointment (by ID)");
			System.out.println("4. View All Patients");
			System.out.println("5. View First and Last Patient");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
			case 2:
				System.out.print("Enter Patient ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				boolean isDuplicate = false;
				for (Patient p : patientQueue) {
					if (p.id == id) {
						isDuplicate = true;
						break;
					}
				}
				if (isDuplicate) {
					System.out.println("Patient ID already exists!");
					break;
				}
				if(choice == 1) {
				System.out.print("Enter Patient Name: ");
				String name1 = sc.nextLine();
				patientQueue.addLast(new Patient(id, name1));
				System.out.println("Patient added to queue.");
				break;
				} else {
					System.out.print("Enter Emergency Patient Name: ");
					String name2 = sc.nextLine();
					patientQueue.addFirst(new Patient(id, name2));
					System.out.println("Emergency patient added to front.");
					break;
				}
			case 3:
				if (patientQueue.isEmpty()) {
					System.out.println("No patients in queue to cancel.");
					break;
				}
				System.out.print("Enter Patient ID to cancel: ");
				int cancelId = sc.nextInt();
				sc.nextLine();
				boolean removed = false;
				for (int i = 0; i < patientQueue.size(); i++) {
					if (patientQueue.get(i).id == cancelId) {
						patientQueue.remove(i);
						System.out.println("Appointment cancelled for ID: " + cancelId);
						removed = true;
						break;
					}
				}
				if (!removed) {
					System.out.println("Patient ID not found.");
				}
				break;

			case 4:
				if (patientQueue.isEmpty()) {
					System.out.println("Queue is empty.");
				} else {
					System.out.println("All Patients in Queue:");
					for (Patient p : patientQueue) {
						System.out.println(p);
					}
				}
				break;

			case 5:
				if (!patientQueue.isEmpty()) {
					System.out.println("First Patient: " + patientQueue.getFirst());
					System.out.println("Last Patient: " + patientQueue.getLast());
				} else {
					System.out.println("Queue is empty.");
				}
				break;

			case 6:
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid choice.");
			}
		} while (choice != 6);

		sc.close();
	}
}
