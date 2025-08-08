package ass2;
import java.util.Scanner;
public class Feedback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String feedback;

		do {
			System.out.println("Please provide your feedback about the recent purchase:");
			feedback = sc.nextLine();
		} while (feedback.isEmpty());

		System.out.println("Thank you for your feedback!");
		sc.close();
	}
}
