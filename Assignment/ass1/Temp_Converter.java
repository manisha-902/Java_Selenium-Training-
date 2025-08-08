package ass1;

public class Temp_Converter {
	static double ctof(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp = Temp_Converter.ctof(37);
		System.out.println("Fahrenheit: "+ temp);
	}

}
