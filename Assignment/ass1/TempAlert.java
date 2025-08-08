package ass1;

public class TempAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = 42; 

        if (temperature < 10) {
            System.out.println("Alert: Cold Weather");
        } else if (temperature >= 10 && temperature < 25) {
            System.out.println("Status: Normal Temperature");
        } else if (temperature >= 25 && temperature < 40) {
            System.out.println("Warning: Hot Weather");
        } else {
            System.out.println("Danger: Extreme Heat!");
        }
	}

}
