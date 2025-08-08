package ass2;

import java.util.Arrays;
import java.util.List;

public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(
				new Student("Arjun"), 
				new Student("Meera"), 
				new Student("Kabir"));

		System.out.println("Enrolled Students:");
		for (Student s : students) {
			System.out.println("- " + s.name);
		}
	}

}
