package day9;
import java.util.*;
public class AppointmentScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> appointments = new TreeMap<>();
		
		appointments.put("2025-04-02 09:00", "Manisha");
		appointments.put("2025-03-10 10:30", "Manas");
		appointments.put("2025-05-09 11:05", "Srusti");
		appointments.put("2025-01-29 07:10", "Rahul");
		
		System.out.println("All appointments: ");
		for(Map.Entry<String, String> entry:appointments.entrySet()) {
			System.out.println("Date and Time: " +entry.getKey()+ "-> Name: " + entry.getValue());
		}
		
		String removeTime = "2025-05-09 11:05";
		if(appointments.containsKey(removeTime)) {
			appointments.remove(removeTime);
			System.out.println("\nRemoved appointment at: "+ removeTime);
		}
		
		String oldTime = "2025-03-10 10:30";
		String newTime = "2025-03-11 11:30";
		if (appointments.containsKey(oldTime)) {
			String patient = appointments.remove(oldTime);
			appointments.put(newTime, patient);
			System.out.println("\nRescheduled from "+oldTime+ " to " +newTime);
		}
		if(!appointments.isEmpty()) {
			Map.Entry<String, String>next = appointments.firstEntry();
			System.out.println("\nNext Appointment:"+ next.getKey()+ "->" +next.getValue());
		}
		if(!appointments.isEmpty()) {
			Map.Entry<String, String>last = appointments.lastEntry();
			System.out.println("\nNext Appointment:"+ last.getKey()+ "->" +last.getValue());
		}
		System.out.println("\nFinal appointments list: ");
		for(Map.Entry<String, String> entry:appointments.entrySet()) {
			System.out.println("Date and Time: " +entry.getKey()+ "-> Name: " + entry.getValue());
		}
		
		System.out.println("\nAppointments (Descending):");
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Map.Entry<String, String> entry : appointments.descendingMap().entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
	}

}
