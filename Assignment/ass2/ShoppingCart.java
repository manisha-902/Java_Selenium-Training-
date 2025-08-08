package ass2;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] itemPrices = { 299.99, 499.50, 150.00, 89.99 };
		double total = 0;

		for (double price : itemPrices) {
			total += price;
		}

		System.out.println("Total cart value: ₹" + total);
	}

}
