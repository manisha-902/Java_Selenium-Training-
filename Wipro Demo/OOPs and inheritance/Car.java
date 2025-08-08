package day3;

public class Car {
	private boolean engineStatus;
	private int speed;
	private double fuelLevel;

	public void setEngineStatus(boolean status) {
		engineStatus = status;
	}

	public boolean getEngineStatus() {
		return engineStatus;
	}

	public void setSpeed(int speed) {
		if (engineStatus) {
			this.speed = speed;
		} else {
			System.out.println("Cannot set speed. Engine is off.");
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setFuelLevel(double fuel) {
		if (fuel >= 0) {
			this.fuelLevel = fuel;
		} else {
			System.out.println("Invalid fuel level.");
		}
	}

	public double getFuelLevel() {

		return fuelLevel;
	}

}
