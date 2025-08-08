package ass2;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentFloor = 0;
		int destinationFloor = 5;

		while (currentFloor < destinationFloor) {
		    currentFloor++;
		    System.out.println("Elevator at floor: " + currentFloor);
		}
		System.out.println("Reached destination floor.");
	}

}
