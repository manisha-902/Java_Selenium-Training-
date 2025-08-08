package day1and2;

public class Patienttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temp = new double[24];
		
		for(int hour=0;hour<24;hour++) {
			temp[hour]=98.0+(hour%5)*0.2;
			System.out.println("Hour" +hour+ ":" + temp[hour]+'F');
		}
			double sum =0;
			for(int i=0;i<24;i++) {
				sum+=temp[i];
			}
		double average = sum/24;
		int temperature =(int)(average * 10);
		average = temperature/10.0;
		
		System.out.println("\n Average Temp of the day:" +average+ 'F');
	}

}
