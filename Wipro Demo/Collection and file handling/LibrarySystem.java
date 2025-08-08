package day9;
import java.io.*;
import java.util.*;

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: Rs." + price);
    }

    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: Rs." + price;
    }
}

public class LibrarySystem {
	
	static final String FILE_NAME = "books.dat";
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Book> books = loadBooks();

        while (true) {
            System.out.println("\n--- Book Store Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> addBook(books);
                case 2 -> searchBook(books);
                case 3 -> updateBook(books);
                case 4 -> deleteBook(books);
                case 5 -> {
                    saveBooks(books);
                    System.out.println("Exiting... Books saved.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static ArrayList<Book> loadBooks() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Book>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    static void saveBooks(ArrayList<Book> books) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    static void addBook(ArrayList<Book> books) {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        books.add(new Book(id, title, author, price));
        System.out.println("Book added.");
    }

    static void searchBook(ArrayList<Book> books) {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.bookId == id) {
                System.out.println("Book found:");
                b.display();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Book not found.");
    }

    static void updateBook(ArrayList<Book> books) {
        System.out.print("Enter Book ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.bookId == id) {
                System.out.print("Enter new Title: ");
                b.title = sc.nextLine();

                System.out.print("Enter new Author: ");
                b.author = sc.nextLine();

                System.out.print("Enter new Price: ");
                b.price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Book updated.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void deleteBook(ArrayList<Book> books) {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            if (it.next().bookId == id) {
                it.remove();
                System.out.println("Book deleted.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

		