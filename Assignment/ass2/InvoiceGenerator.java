package ass2;

public class InvoiceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemNames = { "Apples", "Bananas", "Milk", "Bread", "Eggs", "Rice", "Soap", "Shampoo", "Toothpaste", "Juice" };
		int[] quantities = { 2, 6, 1, 1, 12, 5, 3, 2, 1, 4 };
		double[] unitPrices = { 50.0, 10.0, 45.0, 30.0, 5.0, 60.0, 25.0, 120.0, 80.0, 40.0 };

		double grandTotal = 0;

		System.out.println("----- INVOICE -----");
		System.out.printf("%-15s %-10s %-12s %-12s\n", "Item", "Quantity", "Unit Price", "Total");

		for (int i = 0; i < 10; i++) {
			double total = quantities[i] * unitPrices[i];
			grandTotal += total;

			System.out.printf("%-15s %-10d Rs.%-9.2f Rs.%-5.2f\n", itemNames[i], quantities[i], unitPrices[i], total);
		}

		System.out.println("------------------------------");
		System.out.printf("Grand Total: Rs.%.2f\n", grandTotal);
	}

}
