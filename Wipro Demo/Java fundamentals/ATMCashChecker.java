package day1and2;

public class ATMCashChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations = { 2000, 500, 200, 100 };
		int[][] atmCash = { { 10, 20, 30, 40 }, { 5, 10, 15, 20 }, { 8, 16, 24, 32 } };
		System.out.println("ATM Cash Note Count Matrix:");
		System.out.print("ATM\\Demon\t");
		for (int denom : denominations) {
			System.out.print("Rs." + denom + "\t");
		}
		System.out.println();

		for (int i = 0; i < atmCash.length; i++) {
			System.out.print("ATM" + (i + 1) + "\t\t");
			for (int j = 0; j < atmCash[i].length; j++) {
				System.out.print(atmCash[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n--- Detailed Cash Breakdown ---\n");

		for (int i = 0; i < atmCash.length; i++) {
			int totalCash = 0;
			System.out.println("ATM" + (i + 1) + " Cash Details:");
			for (int j = 0; j < denominations.length; j++) {
				int count = atmCash[i][j];
				int amount = count * denominations[j];
				totalCash += amount;
				System.out.println("Denomination Rs." + denominations[j] + ": " + count + " notes => Rs." + amount);
			}
			System.out.println("Total Cash in ATM" + (i + 1) + ": Rs." + totalCash);
			System.out.println();
		}
	}

}
