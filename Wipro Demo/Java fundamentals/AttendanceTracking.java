package day1and2;
import java.util.Scanner;
public class AttendanceTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] students = { "Manisha", "Srusti", "Manas" };
		String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		int[][] attendance = new int[3][6];

		System.out.println("Enter attendance for each student (1 = Present, 0 = Absent):");

		for (int i = 0; i < students.length; i++) {
			System.out.println("Student: " + students[i]);
			for (int j = 0; j < days.length; j++) {
				System.out.print("  " + days[j] + ": ");
				attendance[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nAttendance Summary:");
		System.out.print("Name\t");
		for (String day : days) {
			System.out.print(day + "\t");
		}
		System.out.println();

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "\t");
			for (int j = 0; j < days.length; j++) {
				System.out.print(attendance[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}

}
