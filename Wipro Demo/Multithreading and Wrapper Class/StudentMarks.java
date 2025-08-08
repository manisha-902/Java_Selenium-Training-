package day7and8;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter roll number: ");
		Integer roll = Integer.valueOf(sc.nextLine());
		
		Double mark1,mark2,mark3;
		System.out.println("Enter Marks of English Subject: ");
		mark1 = Double.valueOf(sc.nextLine());
		
		System.out.println("Enter Marks of Math Subject: ");
		mark2 = Double.valueOf(sc.nextLine());
		
		System.out.println("Enter Marks of Science Subject: ");
		mark3 = Double.valueOf(sc.nextLine());
		
		Double total = mark1 + mark2 + mark3;
		Double average = total/3;
		
		System.out.println("\n-----Student Details------");
		
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll);
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: " +average);
		
		sc.close();
	}

}
