package ass2;

public class ReminderSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] upcomingDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		System.out.println("---- Reminder Schedule for Next 5 Days ----");
		for (int i = 0; i < 5; i++) {
			System.out.println("Reminder set for: " + upcomingDays[i]);
		}
	}

}
