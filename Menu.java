import java.util.Scanner;

public class Menu {

    private Library library = new Library();
    private Scanner sc = new Scanner(System.in);

    public void adminMenu() {

        int choice;

        do {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Logout");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.addBook();
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    library.searchBook();
                    break;

                case 4:
                    library.deleteBook();
                    break;

                case 5:
                    library.issueBook();
                    break;

                case 6:
                    library.returnBook();
                    break;

                case 7:
                    System.out.println("Logging Out...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);
    }

    public void studentMenu() {

        int choice;

        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Logout");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;

                case 2:
                    library.searchBook();
                    break;

                case 3:
                    library.issueBook();
                    break;

                case 4:
                    library.returnBook();
                    break;

                case 5:
                    System.out.println("Logging Out...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }
}
