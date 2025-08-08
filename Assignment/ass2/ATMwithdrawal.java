package ass2;
import java.util.Scanner;
public class ATMwithdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount;
		boolean validAmount;

		do {
			System.out.print("Enter withdrawal amount: ");
			amount = sc.nextInt();
			validAmount = amount > 0 && amount % 100 == 0;
			if (!validAmount) {
				System.out.println("Invalid amount! Must be multiple of 100.");
			}
		} while (!validAmount);

		System.out.println("Processing withdrawal of Rs." + amount);
		sc.close();
	}
}

