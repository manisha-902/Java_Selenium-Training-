package ass1;

public class TaxiService {
	static double baseFare = 50.0;
    double distance; 
    double time; 
    
    TaxiService(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    
    void calculateFare() {
        double totalFare = baseFare + (distance * 10) + (time * 2); // local variable
        System.out.println("Total Fare: Rs. " + totalFare);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxiService ride = new TaxiService(15.5, 30);
        ride.calculateFare();
	}

}
