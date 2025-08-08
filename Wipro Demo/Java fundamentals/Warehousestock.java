package day1and2;
import java.util.Scanner;
public class Warehousestock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Define number of sections and shelves
		int sections, shelves;

		System.out.print("Enter number of sections: ");
		sections = scanner.nextInt();

		System.out.print("Enter number of shelves per section: ");
		shelves = scanner.nextInt();

		int[][] stockGrid = new int[sections][shelves];

		// Input stock data
		System.out.println("\nEnter stock count for each shelf:");
		for (int i = 0; i < sections; i++) {
			for (int j = 0; j < shelves; j++) {
				System.out.print("Section " + (i + 1) + ", Shelf " + (j + 1) + ": ");
				stockGrid[i][j] = scanner.nextInt();
			}
		}

		// Print header
		System.out.println("\nWarehouse Stock Level Grid:");
		System.out.print("Section\\Shelf\t");
		for (int j = 0; j < shelves; j++) {
			System.out.print("Shelf " + (j + 1) + "\t");
		}
		System.out.println();

		// Display stock grid
		int total = 0;
		for (int i = 0; i < sections; i++) {
			System.out.print("Section " + (i + 1) + "\t");
			for (int j = 0; j < shelves; j++) {
				System.out.print(stockGrid[i][j] + "\t\t");
				total += stockGrid[i][j];
			}
			System.out.println();
		}

		// Total stock
		System.out.println("\nTotal items in warehouse: " + total);

		scanner.close();
	}
}