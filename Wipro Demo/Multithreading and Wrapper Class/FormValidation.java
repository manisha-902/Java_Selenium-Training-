package day7and8;
import java.util.Scanner;
public class FormValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		String agestr = sc.nextLine();
		
		System.out.println("Enter your score: ");
		String scorestr = sc.nextLine();
		
		try {
			int age = Integer.parseInt(agestr);
			double score = Double.parseDouble(scorestr);
			
			if (age<18) {
				System.out.println("Invalid age");
			}else if (score<40) {
				System.out.println("Invalid Score");	
			}else {
				System.out.println("Form Submitted Successfully!");
				System.out.println("Age" +age);
				System.out.println("Score"+score);
			}
		}catch(NumberFormatException e) {
			System.out.println("Please enter valid numeric values");
		}
	sc.close();
	}
}
