package ass1;

public class Patient {
	static String hospitalName = "KIMS hospital";
	String name;
	int age;
	String disease;
	
	Patient(String name, int age, String disease){
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
	
	void PatientDetails() {
		int admissionFee = 1000;
		System.out.println("---Patient Details---");
		System.out.println("Patient Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Hospital Name: "+hospitalName);
		System.out.println("Disease: "+disease);
		System.out.println("Admission fee: "+admissionFee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient ("Manisha", 24, "Allergy");
		p1.PatientDetails();
	}

}
