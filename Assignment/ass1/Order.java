package ass1;

public class Order {
	static int totalOrders = 0;
    int orderId;
    String status;
    
    Order(String status) {
        totalOrders++;
        this.orderId = totalOrders;
        this.status = status;
    }
    
    void printSummary() {
        String summary = "Order ID: " + orderId + ", Status: " + status;
        System.out.println(summary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order("Shipped");
        o1.printSummary();
	}

}
