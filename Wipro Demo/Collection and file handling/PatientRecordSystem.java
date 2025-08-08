package day9;

import java.io.*;
import java.util.*;

public class PatientRecordSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fileName = "patient.txt";
		boolean running = true;

		while (running) {
			System.out.print("Enter Patient ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Patient Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Disease: ");
			String disease = sc.nextLine();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine();

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
				String patientRecord = "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: "
						+ age;
				writer.write(patientRecord);
				writer.newLine();
				System.out.println("Patient record saved.\n");
			} catch (IOException e) {
				System.out.println("Error writing to file: " + e.getMessage());
			}

			System.out.print("Do you want to add another patient? (yes/no): ");
			String answer = sc.nextLine();
			if (!answer.equalsIgnoreCase("yes")) {
				running = false;
			}
		}
		System.out.println("\nAll Patient Records:\n");
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading from file: " + e.getMessage());
		}

		sc.close();
	}
}
            