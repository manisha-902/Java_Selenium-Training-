package day1and2;

public class CartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"Shirt", "Shoes", "Watch", "Bag"};
        int[] prices = {999, 1999, 1499, 799};

        System.out.println("Items in your cart:");
        int index = 0;
        for (String item : items) {
            System.out.println(item + " - Rs." + prices[index]);
            index++;
        }
    }
}
