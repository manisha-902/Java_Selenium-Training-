package day9;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Appointments {
	int id;
	String patientName;
	String dateTime;

	public Appointments(int id, String patientName, String dateTime) {
		this.id = id;
		this.patientName = patientName;
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Appointment ID: " + id + ", Patient: " + patientName + ", DateTime: " + dateTime;
	}
}

public class HospitalAppointmentSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Appointments> appointmentMap = new TreeMap<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n---- Hospital Appointment Scheduler ----");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointments");
			System.out.println("3. Remove Appointment");
			System.out.println("4. Reschedule Appointment");
			System.out.println("5. Check Next Appointment");
			System.out.println("6. Check Last Appointment");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Appointment ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				if (appointmentMap.containsKey(id)) {
					System.out.println("Appointment ID already exists.");
					break;
				}
				System.out.print("Enter Patient Name: "); 
				String patientName = sc.nextLine();
				 /*System.out.print("Enter Date & Time (yyyy-MM-dd HH:mm): "); 
				  * String dateTime = sc.nextLine(); 
				  * appointmentMap.put(id, new Appointments(id, name, dateTime));
				  * System.out.println("Appointment Added.");
				 */
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				String dateTime = now.format(formatter);
				appointmentMap.put(id, new Appointments(id, patientName, dateTime));
				System.out.println(" Appointment Added at " + dateTime);
				break;

			case 2:
				if (appointmentMap.isEmpty()) {
					System.out.println("No appointments found.");
				} else {
					System.out.println("Scheduled Appointments (Sorted by ID):");
					for (Map.Entry<Integer, Appointments> entry : appointmentMap.entrySet()) {
						System.out.println(entry.getValue());
					}
				}
				break;

			case 3:
				System.out.print("Enter Appointment ID to remove: ");
				int removeId = sc.nextInt();
				if (appointmentMap.remove(removeId) != null) {
					System.out.println("Appointment Removed.");
				} else {
					System.out.println("No such appointment.");
				}
				break;

			case 4:
				System.out.print("Enter Appointment ID to reschedule: ");
				int rescheduleId = sc.nextInt();
				sc.nextLine();
				if (appointmentMap.containsKey(rescheduleId)) {
					System.out.print("Enter New Date & Time (yyyy-MM-dd HH:mm): ");
					String newDateTime = sc.nextLine();
					Appointments appt = appointmentMap.get(rescheduleId);
					appt.dateTime = newDateTime;
					System.out.println("Appointment Rescheduled.");
				} else {
					System.out.println("Appointment ID not found.");
				}
				break;

			case 5:
				if (!appointmentMap.isEmpty()) {
					System.out.println("Next Appointment:");
					System.out.println(appointmentMap.firstEntry().getValue());
				} else {
					System.out.println("No upcoming appointments.");
				}
				break;

			case 6:
				if (!appointmentMap.isEmpty()) {
					System.out.println("Last Appointment:");
					System.out.println(appointmentMap.lastEntry().getValue());
				} else {
					System.out.println("No appointments.");
				}
				break;

			case 7:
				System.out.println("Exiting Scheduler.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
