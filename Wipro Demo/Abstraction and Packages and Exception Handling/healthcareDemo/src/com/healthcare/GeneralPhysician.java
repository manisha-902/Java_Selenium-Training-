package com.healthcare;

public class GeneralPhysician extends Doctor  {
	 public GeneralPhysician(String name) {
	        super(name, "General Physician");
	    }

	    public void diagnose(Patient patient) {
	        System.out.println("General Physician " + name + " diagnosing patient: " + patient.getName());
	        System.out.println("Diagnosis: Basic health check. Prescribe general medication.");
	    }

}
