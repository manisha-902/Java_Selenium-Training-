package day9;
import java.util.*;

class Appointment implements Comparable<Appointment> {
    String patientName;
    String dateTime; 

    public Appointment(String patientName, String dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }

    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime); 
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return this.dateTime.equals(other.dateTime) && this.patientName.equals(other.patientName);
    }

    public int hashCode() {
        return Objects.hash(patientName, dateTime);
    }
    
    public String toString() {
        return "Appointment for " + patientName + " at " + dateTime;
    }
}
public class AppointmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Appointment> appointmentSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Appointment Scheduler");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter patient name: ");
                String name = sc.nextLine();
                System.out.print("Enter appointment date and time (yyyy-MM-dd HH:mm): ");
                String dateTime = sc.nextLine();

                Appointment newAppt = new Appointment(name, dateTime);
                boolean added = appointmentSet.add(newAppt);
                if (added) {
                    System.out.println(" Appointment added.");
                } else {
                    System.out.println(" Duplicate appointment. Not added.");
                }
                break;

            case 2:
                if (appointmentSet.isEmpty()) {
                    System.out.println("No appointments scheduled.");
                } else {
                    System.out.println("\n All Scheduled Appointments:");
                    for (Appointment appt : appointmentSet) {
                        System.out.println(appt);
                    }
                }
                break;

            case 3:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid option. Try again.");
        }
    }
}
}
