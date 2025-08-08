package day3;
import java.util.Scanner;
public class NotificationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Notification Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        Notification notification = null;

        switch (choice) {
            case 1:
                System.out.print("Enter email address: ");
                String email = scanner.nextLine();
                notification = new EmailNotification(message, email);
                System.out.print("Successfully sent!");
                break;
            case 2:
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
                notification = new SMSNotification(message, phone);
                System.out.print("Successfully sent!");
                break;
            case 3:
                System.out.print("Enter device token: ");
                String token = scanner.nextLine();
                notification = new PushNotification(message, token);
                System.out.print("Successfully sent!");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
              }
        scanner.close();
	}
}
