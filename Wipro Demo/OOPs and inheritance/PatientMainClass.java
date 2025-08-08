package day3;

public class PatientMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient = new Patient();
		 patient.setName("Manisha");
		 patient.setAge(24);
		 patient.setHealthInfo("Fever and mild headache");
		 System.out.println("Patient Name: " + patient.getName());
	     System.out.println("Patient Age: " + patient.getAge());
	}

}
