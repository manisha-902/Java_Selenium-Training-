package ass2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String username, password;
		boolean isAuthenticated = false;

		do {
			System.out.print("Enter Username: ");
			username = sc.nextLine();
			System.out.print("Enter Password: ");
			password = sc.nextLine();

			if (username.equals("admin") && password.equals("1234")) {
				isAuthenticated = true;
				System.out.println("Login successful!");
			} else {
				System.out.println("Incorrect credentials. Try again.");
			}
		} while (!isAuthenticated);
		sc.close();
	}

}
