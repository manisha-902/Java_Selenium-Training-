package ass1;

public class TrafficLightController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String lightColor = "YELLOW";

	        switch (lightColor.toUpperCase()) {
	            case "RED":
	                System.out.println("Stop");
	                break;
	            case "YELLOW":
	                System.out.println("Ready");
	                break;
	            case "GREEN":
	                System.out.println("Go");
	                break;
	            default:
	                System.out.println("Invalid light color");
	        }
	}

}
