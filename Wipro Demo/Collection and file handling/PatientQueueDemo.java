package day9;

import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> patientQueue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n Hospital Patient Queue_ _ _ :");
			System.out.println("1. Add New Patient(normal)");
			System.out.println("2. Add emergeny patient");
			System.out.println("3. Remove patient");
			System.out.println("4. View all Patient");
			System.out.println("5. View first and last patient");
			System.out.println("6. Show Total Patients");
			System.out.println("7. Check if a Patient Exists");
			System.out.println("8. Find Patient Position");
			System.out.println("9. Exit");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter patient name :");
		        String patient =sc.nextLine();
		        patientQueue.addLast(patient);
			    System.out.println("Added to queue.");
			case 2:
				System.out.println("Enter emergency patient name :");
				String emergencyPatient= sc.nextLine();
		        patientQueue.addFirst(emergencyPatient);
			    System.out.println("Emergency pateint added to front :");

			case 3:
				if (!patientQueue.isEmpty()) {
					String remove = patientQueue.removeFirst();
					System.out.println("Removed patient :" + remove);
				} else {
					System.out.println("No patient in queue");
				}
				break;

			case 4:
				System.out.println("Current Queue :" + patientQueue);
				break;

			case 5:
				if (!patientQueue.isEmpty()) {
					System.out.println(" First :" + patientQueue.getFirst());
					System.out.println("Last :" + patientQueue.getLast());
				} else {
					System.out.println("Queue is empty");
				}
				break;
			case 6:
				System.out.println("Total number of Patients :" + patientQueue.size());
				break;
			case 7:
				System.out.println("Enter Patient name to check");
				String searchName = sc.nextLine();
				if(patientQueue.contains(searchName)) {
					System.out.println("Patient" + searchName +"is in the queue.");
				}else {
					System.out.println("Patient" + searchName +"is NOT in the queue.");
				}
				break;
			case 8:
				System.out.print("Enter Patient name to find Position:");
				String findName = sc.nextLine();
				int index = patientQueue.indexOf(findName);
				if(index !=-1) {
					System.out.println("Patient" + findName +"is at position"+(index + 1));
				}else {
					System.out.println("Patient" + findName +"not found in the queue.");
				}
				break;
			case 9:
				System.out.println("Exiting......");
				break;

			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 6);
		sc.close();
	}
}
		 