package com.healthcare;
import java.util.Scanner;
public class HealthcareModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		PatientService service = new PatientServiceImpl();
		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter details for Patient " + i + ":");

			System.out.print("ID: ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			sc.nextLine();

			System.out.print("Illness: ");
			String illness = sc.nextLine();

			Patient p = new Patient(id, name, age, illness);
			service.registerPatient(p);
		}

		System.out.println("\nEnter Patient ID to view details:");
		int searchId = sc.nextInt();
		service.showPatientDetails(searchId);

		Doctor doc1 = new GeneralPhysician("Dr. Shiv");
		Doctor doc2 = new Cardiologist("Dr. Manas");

		System.out.println("\n--- Diagnosis ---");
		for (int i = 1; i <= 2; i++) {
			System.out.print("Enter Patient ID for diagnosis: ");
			int pid = sc.nextInt();
			Patient dia = new Patient(pid, "", 0, "");
			doc1.diagnose(dia);
			doc2.diagnose(dia);
		}

	}
}
