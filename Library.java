import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Book
    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        books.add(new Book(id, title, author, category));

        System.out.println("Book Added Successfully!");
    }

    // Display Books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\n===== BOOK LIST =====");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search Book
    public void searchBook() {

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    // Delete Book
    public void deleteBook() {

        System.out.print("Enter Book ID to Delete: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {
                books.remove(book);
                System.out.println("Book Deleted Successfully.");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Issue Book
    public void issueBook() {

        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {

                if (book.isIssued()) {
                    System.out.println("Book Already Issued.");
                } else {
                    book.setIssued(true);
                    System.out.println("Book Issued Successfully.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Return Book
    public void returnBook() {

        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {

                if (!book.isIssued()) {
                    System.out.println("Book Was Not Issued.");
                } else {
                    book.setIssued(false);
                    System.out.println("Book Returned Successfully.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }
}
