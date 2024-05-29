package problem4;

public class BookDemo {
    public static void main(String[] args) {
        Book book=new Book("Original Book Name", 12345, "Original Author");
        // Display the original book details
        System.out.println("Original Book Details:");
        book.BKDisplay();

        // Update the book details with new values
        book.BKUpdateDetails("Updated Book Name", 54321, "Updated Author");

        // Display the updated book details
        System.out.println("\nUpdated Book Details:");
        book.BKDisplay();


    }
}
