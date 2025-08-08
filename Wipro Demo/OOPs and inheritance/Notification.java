package day3;

public abstract class Notification {
	String message;

	Notification(String message) {
		this.message = message;
	}

	abstract void send();
}

class EmailNotification extends Notification {
	String emailAddress;

	EmailNotification(String message, String emailAddress) {
		super(message);
		this.emailAddress = emailAddress;
	}

	void send() {
		System.out.println("Sending Email to " + emailAddress + ": " + message);
	}
}

// SMS notification subclass
class SMSNotification extends Notification {
	String phoneNumber;

	SMSNotification(String message, String phoneNumber) {
		super(message);
		this.phoneNumber = phoneNumber;
	}

	void send() {
		System.out.println("Sending SMS to " + phoneNumber + ": " + message);
	}
}

class PushNotification extends Notification {
	String deviceToken;

	PushNotification(String message, String deviceToken) {
		super(message);
		this.deviceToken = deviceToken;
	}

	void send() {
		System.out.println("Sending Push Notification to device " + deviceToken + ": " + message);
	}
}
