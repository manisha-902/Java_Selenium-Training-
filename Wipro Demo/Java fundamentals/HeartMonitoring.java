package day1and2;

public class HeartMonitoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperature = 38.0;  // starting abnormal temperature
        int hour = 1;

        while (temperature < 36.1 || temperature > 37.2) {
            System.out.println("Hour " + hour + ": Temperature = " + temperature + "°C → Abnormal");
            temperature = temperature - 0.3;  // reduce temp every hour
            hour++;
        }

        System.out.println("Hour " + hour + ": Temperature = " + temperature + "°C → Normal");
        System.out.println("Patient's heart temperature is now normal.");
    }
}
