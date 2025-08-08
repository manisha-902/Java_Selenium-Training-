package ass1;

public class Bill {
	static String companyName = "Power India";
    String customerName;
    int unitsConsumed;
    
    Bill(String name, int units) {
        this.customerName = name;
        this.unitsConsumed = units;
    }
    
    void calculateBill() {
        double billAmount; // local variable
        if (unitsConsumed <= 100)
            billAmount = unitsConsumed * 1.5;
        else
            billAmount = 100 * 1.5 + (unitsConsumed - 100) * 2.5;
        System.out.println("Bill for " + customerName + ": Rs. " + billAmount);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill = new Bill("Manisha", 160);
        bill.calculateBill();
	}

}
