package ass1;

public class Student {
	static String school = "ABA School";
	String name;
	int rollnum;
	int marks;
	
	Student(String name, int rollnum, int marks){
		this.name = name;
		this.rollnum = rollnum;
		this.marks = marks;
	}
	
	void calculateGrade() {
		char grade;
		if (marks >= 90) grade ='A';
		else if (marks >= 75) grade ='B';
		else if (marks >= 50) grade ='C';
		else grade = 'D';
		System.out.println(name + " Grade: " +grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student = new Student("Manisha", 45678, 82);
		Student.calculateGrade(); 
		
	}

}
