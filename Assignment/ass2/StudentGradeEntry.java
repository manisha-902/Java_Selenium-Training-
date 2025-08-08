package ass2;

public class StudentGradeEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[30];

        System.out.println("---- Student Marks Entry ----");
        for (int i = 0; i < 30; i++) {
            marks[i] = 50 + (i % 51); 
            System.out.println("Student Roll No: " + (i + 1) + " | Marks: " + marks[i]);
        }
	}

}
