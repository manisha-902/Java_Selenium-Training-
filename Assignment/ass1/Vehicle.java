package ass1;

public class Vehicle {
	static String transportOfficeName = "RTO Bhubaneswar";
    String registrationNumber;
    String ownerName;
    
    Vehicle(String regNo, String owner) {
        this.registrationNumber = regNo;
        this.ownerName = owner;
    }
    
    void printRegistrationDetails() {
        int registrationFee = 500; 
        System.out.println("Transport Office: " + transportOfficeName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("OD02AB1234", "Rahul Verma");
        v.printRegistrationDetails();
	}

}
