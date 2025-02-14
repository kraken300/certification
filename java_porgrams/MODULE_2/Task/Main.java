// Main class to test 
public class Main {
    public static void main(String[] args) {
        Library library = new Library(5); // Library can hold up to 5 books

        // Creating book objects
        Book book1 = new Book("Java Programming", "John Doe", "123456", 39.99);
        Book book2 = new Book("Data Structures", "Jane Smith", "789012", 49.99);

        // Adding books to library
        library.addBook(book1);
        library.addBook(book2);

        // Displaying books in library
        library.displayBooks();
        System.out.println();

        // Creating members
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        // Borrowing books
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        // Displaying borrowed books
        System.out.println("\nBorrowed Books:");
        member1.displayBorrowedBook();
        member2.displayBorrowedBook();
        System.out.println();
        // Returning books
        System.out.println("Returning books...\n");
        member1.returnBook();
        member2.returnBook();
        // Display available books after return
        library.displayAvailableBooks();
    }
}