package ass1;

public class MobileRechargePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int planNumber = 2;

		System.out.println("Selected Plan Number: " + planNumber);
		System.out.println("Plan Details:");

		switch (planNumber) {
		case 1:
			System.out.println("Plan 1:");
			System.out.println("Validity: 28 days");
			System.out.println("Data: 1.5 GB/day");
			System.out.println("Price: ₹199");
			break;

		case 2:
			System.out.println("Plan 2:");
			System.out.println("Validity: 56 days");
			System.out.println("Data: 2 GB/day");
			System.out.println("Price: ₹399");
			break;

		case 3:
			System.out.println("Plan 3:");
			System.out.println("Validity: 84 days");
			System.out.println("Data: 3 GB/day");
			System.out.println("Price: ₹699");
			break;

		case 4:
			System.out.println("Plan 4:");
			System.out.println("Validity: 365 days");
			System.out.println("Data: 2 GB/day");
			System.out.println("Price: ₹2399");
			break;

		default:
			System.out.println("Invalid Plan Number. Please select between 1 and 4.");
		}
	}

}
