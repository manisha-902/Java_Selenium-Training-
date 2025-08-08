package ass2;

public class ToxicMoniter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toxicLevel = 120;

		while (toxicLevel > 100) {
		    System.out.println("Warning: Toxic level high (" + toxicLevel + ")");
		    toxicLevel -= 5;
		}
		System.out.println("Toxic level safe now.");
	}

}
