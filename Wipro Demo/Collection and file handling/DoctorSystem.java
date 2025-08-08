package day9;

import java.util.*;

class Doctor {
	private int licenseNumber;
	private String name;
	private String department;

	public Doctor(int licenseNumber, String name, String department) {
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.department = department;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Doctor))
			return false;
		Doctor other = (Doctor) obj;
		return this.licenseNumber == other.licenseNumber;
	}

	public int hashCode() {
		return Objects.hash(licenseNumber);
	}

	public String toString() {
		return "License No: " + licenseNumber + ", Name: " + name + ", Department: " + department;
	}
}

public class DoctorSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Doctor> doctorSet = new HashSet<>();

		while (true) {
			System.out.println("\n--- Doctor Registration System ---");
			System.out.println("1. Add New Doctor");
			System.out.println("2. Display All Doctors");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter License Number: ");
				int license = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Department: ");
				String dept = sc.nextLine();

				Doctor newDoctor = new Doctor(license, name, dept);

				if (doctorSet.add(newDoctor)) {
					System.out.println("Doctor registered successfully.");
				} else {
					System.out.println("Doctor with this license number is already registered!");
				}
				break;
			case 2:
				if (doctorSet.isEmpty()) {
					System.out.println("No doctors registered yet.");
				} else {
					System.out.println("Registered Doctors:");
					for (Doctor d : doctorSet) {
						System.out.println(d);
					}
				}
				break;
			case 3:
				System.out.println("Exiting system....");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		}
	}

}
