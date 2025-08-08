package ass2;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lives = 3;
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);

		while (lives > 0 && !exit) {
			System.out.println("You are playing... Lives left: " + lives);
			System.out.print("Do you want to quit? (yes/no): ");
			String response = scanner.nextLine();

			if (response.equalsIgnoreCase("yes")) {
				exit = true;
			} else {
				lives--; 
			}
		}

		System.out.println("Game Over!");
		scanner.close();
	}
}
