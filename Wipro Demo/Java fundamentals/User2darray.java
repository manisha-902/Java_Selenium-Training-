package day1and2;
import java.util.Scanner;
public class User2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] arr = new int[rows][cols];
	        
	        System.out.println("Enter " + (rows * cols) + " values:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("The 2D Array is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

