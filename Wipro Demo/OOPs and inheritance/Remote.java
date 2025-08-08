package day3;

public abstract class Remote {
	abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends Remote {
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
class ACRemote extends Remote {
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}
