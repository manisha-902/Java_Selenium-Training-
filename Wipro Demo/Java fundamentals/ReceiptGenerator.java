package day1and2;

import java.util.Scanner;

public class ReceiptGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        
        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        double total = qty * price;
        StringBuffer receipt = new StringBuffer();

        receipt.append("---------RECEIPT--------\n");
        receipt.append("Customer Name:").append(name).append("\n");
        receipt.append("Item Purchased: ").append(item).append("\n");
        receipt.append("Quantity: ").append(qty).append("\n");
        receipt.append("Price per Item: Rs. ").append(price).append("\n");
        receipt.append("Total Amount: Rs. ").append(total).append("\n");
        System.out.println("\n" + receipt);
        sc.close();
    }
	}


