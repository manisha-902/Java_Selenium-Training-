package day4and5;

public class LibraryBook {
	int bookId;
	String title;
	
	void displayDetails() {
		System.out.println("BookID: "+bookId);
		System.out.println("Title: "+title);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryBook book1 = new LibraryBook();
		book1.displayDetails();

	}

}
