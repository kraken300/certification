// Library class 
public class Library {
    private Book[] books;
    private int bookCount;

    // Constructor
    public Library(int size) {
        books = new Book[size]; // Fixed-size array
        bookCount = 0;
    }

    // Add book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getDetails());
        }
    }

    // Display available books
    public void displayAvailableBooks() {
        System.out.println("Available Books in Library:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getDetails());
            }
        }
    }
}
