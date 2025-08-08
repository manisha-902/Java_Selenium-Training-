package day3;
import java.util.Scanner;

abstract class Vehicle {
 abstract void startEngine();
}

class Truck extends Vehicle {
 void startEngine() {
     System.out.println("Truck engine started. Ready to drive!");
 }
}
class Bike extends Vehicle {
 void startEngine() {
     System.out.println("Bike engine started. Ready to ride!");
 }
}
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose your vehicle: 1. Truck  2. Bike");
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Truck();
        } else if (choice == 2) {
            vehicle = new Bike();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        vehicle.startEngine();

        sc.close();
	}

}
