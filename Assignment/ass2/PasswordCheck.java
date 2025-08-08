package ass2;
import java.util.Scanner;
public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctPassword = "admin123";
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (!input.equals(correctPassword)) {
			System.out.print("Enter password: ");
			input = scanner.nextLine();
		}

		System.out.println("Access granted!");
		scanner.close();
	}
}

