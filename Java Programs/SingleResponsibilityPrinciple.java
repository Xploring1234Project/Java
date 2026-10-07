/**
 * MODEL CLASS: Responsible only for holding Book data.
 */
class Book {
    private String title;
    private String author;
    private String text;

    public Book(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public String getText() { return this.text; }
}

/**
 * PRESENTATION CLASS: Responsible only for printing/formatting.
 */
class BookPrinter {
    public void printBookDetails(Book book) {
        System.out.println("--- Printing Book ---");
        System.out.println("Title:   " + book.getTitle());
        System.out.println("Author:  " + book.getAuthor());
        System.out.println("Content: " + book.getText());
    }
}

/**
 * PERSISTENCE CLASS: Responsible only for storage logic.
 */
class BookRepository {
    public void saveToFile(Book book) {
        System.out.println("Saving '" + book.getTitle() + "' to text file...");
    }
}

/**
 * MAIN CLASS: Orchestrates the objects.
 */
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        // 1. Create the data object
        Book myBook = new Book("Clean Code", "Robert C. Martin", "Focus on one thing.");

        // 2. Use specialized classes for specific tasks
        BookPrinter printer = new BookPrinter();
        BookRepository repository = new BookRepository();

        // 3. Execute actions
        printer.printBookDetails(myBook);
        repository.saveToFile(myBook);
    }
}