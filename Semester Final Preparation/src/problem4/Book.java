package problem4;

public class Book {
    public String BKName;
    public int BKid;
    public String BKAuthor;

    // parameterized constructor
    public Book(String BKName, int BKid, String BKAuthor) {
        this.BKName = BKName;
        this.BKid = BKid;
        this.BKAuthor = BKAuthor;
    }

    // Method to update book details
    public void BKUpdateDetails(String name,int id,String author){
        this.BKName = name;
        this.BKid = id;
        this.BKAuthor = author;
    }
    // Method to display book details
    public void BKDisplay() {
        System.out.println("Book Name: " + BKName);
        System.out.println("Book ID: " + BKid);
        System.out.println("Book Author: " + BKAuthor);
    }
}
