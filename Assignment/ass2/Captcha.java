package ass2;

public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		String captcha = "X7K9";

		while (!input.equals(captcha)) {
		    input = "X7K9"; 
		    System.out.println("Enter CAPTCHA: "+input);
		}
		System.out.println("CAPTCHA validated.");
	}

}
