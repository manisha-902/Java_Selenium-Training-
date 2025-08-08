package ass2;

public class TaskCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = { "Sun", "Mon", "Tue", "wed", "Thur", "Fri", "Sat" };
		int[] units = { 89, 78, 94, 45, 69, 100, 84 };
		int[] timeTaken = { 5, 6, 7, 3, 5, 8, 7 };

		System.out.println("-----------Task Efficiency-----------");
		System.out.printf("%-15s %-10s %-12s %-12s\n", "Days", "Units", "TimeTaken(hr)", "Efficiency");

		for (int i = 0; i < days.length; i++) {
			float Efficiency = units[i] / timeTaken[i];
			System.out.printf("%-15s %-10d %-12d %-12.2f\n", days[i], units[i], timeTaken[i], Efficiency);
		}
	}

}
