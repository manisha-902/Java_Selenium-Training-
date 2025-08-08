package day3;

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setFuelLevel(40.5);
        System.out.println("Fuel Level: " + car.getFuelLevel() + " litres");
        car.setSpeed(60);
        car.setEngineStatus(true);
        System.out.println("Engine Status: " + (car.getEngineStatus() ? "On" : "Off"));
        car.setSpeed(60);
        System.out.println("Speed: " + car.getSpeed() + " km/h");

	}

}
