package com.healthcare;

public class PatientServiceImpl implements PatientService {
	private Patient[] patients = new Patient[100];
	private int patientCount = 0;

	public void registerPatient(Patient patient) {
		if (patientCount < patients.length) {
			patients[patientCount] = patient;
			System.out.println("Patient " + patient.getName() + " registered.");
			patientCount++;
		} else {
			System.out.println("Patient list is full. Cannot register more patients.");
		}
	}
	public void showPatientDetails(int patientId) {
        boolean found = false;
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getId() == patientId) {
                Patient p = patients[i];
                System.out.println("ID: " + p.getId());
                System.out.println("Name: " + p.getName());
                System.out.println("Age: " + p.getAge());
                System.out.println("Illness: " + p.getIllness());
                found = true;
                break;
            }
        }
        if (!found) {
        	System.out.println("Patient with ID " + patientId + " not found.");
        }
    }
}