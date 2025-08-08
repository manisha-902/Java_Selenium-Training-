package day3;
class MessageSender {
    public void sendMessage() {
        System.out.println("Sending a message");
    }
}

class Email extends MessageSender {
    public void sendMessage() {
        System.out.println("Email sent!");
    }
}

class SMS extends MessageSender {
    public void sendMessage() {
        System.out.println("SMS sent!");
    }
}
public class MessageInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageSender s1 = new MessageSender();
        s1.sendMessage();
        
		MessageSender s2 = new Email();
        s2.sendMessage();

        MessageSender s3 = new SMS();
        s3.sendMessage();

    }
}
