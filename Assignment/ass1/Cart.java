package ass1;

public class Cart {
	static int totalCarts = 0;
    String[] items;
    int[] quantities;
    
    Cart(String[] items, int[] quantities) {
        this.items = items;
        this.quantities = quantities;
        totalCarts++;
    }
    
    void calculateTotal(double[] prices) {
        double totalAmount = 0;
        for (int i = 0; i < items.length; i++) {
            totalAmount += quantities[i] * prices[i];
        }
        System.out.println("Total Amount: Rs. " + totalAmount);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"Pen", "Notebook"};
        int[] quantities = {2, 3};
        double[] prices = {10, 40};

        Cart cart = new Cart(items, quantities);
        cart.calculateTotal(prices);
	}

}
