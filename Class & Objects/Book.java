class Book {
    static int totalNoOofBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOofBooks=0;
    }
    {
        totalNoOofBooks++;
    }

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getToalNoOfBooks()
    {
        return totalNoOofBooks;
    } 

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed=true;
            System.out.println("Enjoy "+title);
        }
        
    }
    
    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }
        else{
            System.out.println("This book is already in the libary");
        }
            
    }
    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getToalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        //myBook.returnBook();
        designOfThings.returnBook();
    }
}

