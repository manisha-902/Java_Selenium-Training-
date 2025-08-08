package day1and2;

public class Carttotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0, itemPrice = 120;
		do {
			total += itemPrice;
			System.out.println("Added item So Cart total is: Rs." + total);
		} while (total <= 500);
	}
}
