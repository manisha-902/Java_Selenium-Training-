package day1and2;

public class PrinArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"Pensil","Pen","Box"};
		int[] counts = {4,5,6};
		
		System.out.println("List of items available");
		for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + counts[i] + "kg");
        }
	}

}
