package ass1;

public class Product {
	static String companyName = "Boat";
	int productID;
	String productName;
	float price;
	
	Product(int productID, String productName, float price){
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	void calculateDiscountedPrice(double discountPercent) {
        double discountedPrice = price - (price * discountPercent / 100); // local variable
        System.out.println("Product: " + productName + ", Discounted Price: Rs. " + discountedPrice);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(101, "Earphone", 5000);
        p.calculateDiscountedPrice(10);
	}

}
