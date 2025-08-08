package ass1;

public class Book {
	static int totalBooks = 0;
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		totalBooks++;
	}
	
	void issueBook() {
		boolean issued = true;
		System.out.println("Books issued: " + title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("All in one", "R K Sahu");
		Book book2 = new Book("Three world", "P R Mishra");
		book1.issueBook();
		book2.issueBook();
		System.out.println("Total Books: "+totalBooks);

	}

}
