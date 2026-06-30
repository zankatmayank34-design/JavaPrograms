package OOPs;

class Book{

    static int totalBooks;

    String titleOfBook;
    String authorOfBook;
    String isbnNoOfBook;

    boolean isBorrowed;
    boolean isReturn;

    static{
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String isbnNoOfBook, String titleOfBook, String authorOfBook){
    this.titleOfBook = titleOfBook;
    this.authorOfBook = authorOfBook;
    this.isbnNoOfBook = isbnNoOfBook;
    }

    Book(String isbnNoOfBook){
        this(isbnNoOfBook, "Unknown", "Unknown");
    }

   ; static int getTotalBooks(){
        return totalBooks;
    }

    void BorrowBook(){
        if (isBorrowed){
            System.out.println("This Book is already borrowed...");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.titleOfBook);
        }
    }
    void ReturnBook(){
            if (isBorrowed){
                this.isBorrowed = false;
                System.out.println("Hope you enjoyed, Please leave a reveiw");
            } else {
                System.out.println("This book is already in the library");
            }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "DesignOfThings","Author");
        Book MyBook = new Book("A12");

        System.out.println("Total No. of Books: " + totalBooks);
        designOfThings.BorrowBook();
        MyBook.BorrowBook();
        designOfThings.BorrowBook();
        designOfThings.ReturnBook();
        designOfThings.ReturnBook();
    }
}