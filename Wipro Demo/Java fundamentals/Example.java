package day1and2;

public class Example {
	String name;
	int roll;
	
	static String schoolName = "AAA School";
	
	Example(String n,int r){
		name = n;
		roll = r;
	}
	
	void showDetails() {
		int passingMark =40;
		System.out.println("Name:" +name);
		System.out.println("School Name:" +schoolName);
		System.out.println("Passing Mark:" +passingMark);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example s1 = new Example("Manisha",6);
		Example s2 = new Example("Srusti",7);

		s1.showDetails();
		s2.showDetails();
		
	}

}
