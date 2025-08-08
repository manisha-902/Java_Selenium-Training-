package day3;

import java.util.Scanner;

class Student {
	private String name;
	private int rollNumber;
	private double percentage;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setPercentage(double percentage) {
		if (percentage >= 0 && percentage <= 100) {
			this.percentage = percentage;
		} else {
			System.out.println("Invalid percentage! Please enter between 0 to 100.");
		}
	}

	public double getPercentage() {
		return percentage;
	}

	public void displayDetails() {
		System.out.println("\n--- Student Details ---");
		System.out.println("Name       : " + name);
		System.out.println("Roll No.   : " + rollNumber);
	}
}
class Subject {
	private String subjectName;
	private int marks;

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}
}
public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		student.setName(name);

		System.out.print("Enter Roll Number: ");
		int roll = sc.nextInt();
		student.setRollNumber(roll);
		
		System.out.print("Enter number of subjects: ");
		int subjectCount = sc.nextInt();
		sc.nextLine();
		Subject[] subjects = new Subject[subjectCount];
		int totalMarks = 0;

		for (int i = 0; i < subjectCount; i++) {
			subjects[i] = new Subject();
			System.out.println("\nEnter details for Subject " + (i + 1));

			System.out.print("Subject Name: ");
			String subName = sc.nextLine();
			subjects[i].setSubjectName(subName);

			System.out.print("Marks (out of 100): ");
			int marks = sc.nextInt();
			sc.nextLine();
			subjects[i].setMarks(marks);

			totalMarks += marks;
		}

		double percentage = (double) totalMarks / (subjectCount * 100) * 100;
		student.setPercentage(percentage);

		student.displayDetails();

		System.out.println("\n--- Subjects Taken ---");
		for (int i = 0; i < subjectCount; i++) {
			System.out.println("Subject: " + subjects[i].getSubjectName() + ", Marks: " + subjects[i].getMarks());
		}

		sc.close();
	}

}
