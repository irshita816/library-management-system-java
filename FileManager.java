import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "data/books.txt";

    // Save all books to file
    public static void saveBooks(ArrayList<Book> books) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

            for (Book book : books) {

                writer.write(book.getId() + "," +
                             book.getTitle() + "," +
                             book.getAuthor() + "," +
                             book.getCategory() + "," +
                             book.isIssued());

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error Saving Books.");

        }

    }

    // Load books from file
    public static ArrayList<Book> loadBooks() {

        ArrayList<Book> books = new ArrayList<>();

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return books;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Book book = new Book(

                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3]

                );

                book.setIssued(Boolean.parseBoolean(data[4]));

                books.add(book);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error Loading Books.");

        }

        return books;

    }

}
