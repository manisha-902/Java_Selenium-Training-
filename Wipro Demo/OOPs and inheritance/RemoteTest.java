package day3;
import java.util.Scanner;
public class RemoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose Device: 1. TV  2. AC");
        int deviceChoice = sc.nextInt();
        sc.nextLine();
        
        Remote remote;

        if (deviceChoice == 1) {
            remote = new TVRemote();
        } else if (deviceChoice == 2) {
            remote = new ACRemote();
        } else {
            System.out.println("Invalid device choice.");
            sc.close();
            return;
        }

        System.out.println("Do you want to turn ON or OFF the device? (on/off):");
        String action = sc.nextLine().toLowerCase();
        if (action.equals("on")) {
            remote.turnOn();
        } else if (action.equals("off")) {
            remote.turnOff();
        } else {
            System.out.println("Invalid action.");
        }

        sc.close();
	}

}
