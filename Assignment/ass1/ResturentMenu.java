package ass1;

public class ResturentMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuItem = 3; 
		System.out.println("Selected Menu Item: " + menuItem);
		System.out.println("Order Details:");

		switch (menuItem) {
		case 1:
			System.out.println("Dish: Margherita Pizza");
			System.out.println("Price: ₹250");
			break;
		case 2:
			System.out.println("Dish: Veg Biryani");
			System.out.println("Price: ₹180");
			break;
		case 3:
			System.out.println("Dish: Butter Chicken");
			System.out.println("Price: ₹320");
			break;
		case 4:
			System.out.println("Dish: Paneer Tikka");
			System.out.println("Price: ₹220");
			break;
		case 5:
			System.out.println("Dish: Masala Dosa");
			System.out.println("Price: ₹100");
			break;
		default:
			System.out.println("Invalid Menu Item. Please choose a valid item (1-5).");
		}
	}

}
