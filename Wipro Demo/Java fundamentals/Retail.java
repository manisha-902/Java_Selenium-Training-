package day1and2;

public class Retail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sales = new int[3][];

		sales[0] = new int[] { 10, 5, 8 };

		sales[1] = new int[] { 4, 7, 2, 6, 3 };

		sales[2] = new int[] { 9, 11 };

		for (int i = 0; i < sales.length; i++) {
			System.out.println("Store " + (i + 1) + " Sales:");
			int total = 0;
			for (int j = 0; j < sales[i].length; j++) {
				System.out.println("  Product " + (j + 1) + ": " + sales[i][j] + " units");
				total += sales[i][j];
			}
			System.out.println("  Total units sold by Store " + (i + 1) + ": " + total);
			System.out.println();
		}
	}
}

