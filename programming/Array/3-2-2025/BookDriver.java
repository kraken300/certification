import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book(2, "ATOMIC HABITS", 1200);
        Book b2 = new Book(1, "THE ALCHEMIST", 1500);
        Book b3 = new Book(5, "THINK AND GROW RICH", 1400);
        Book b4 = new Book(4, "ATTITUDE IS EVERYTHING", 1600);
        Book b5 = new Book(9, "RICH DAD POOR DAD", 1300);
        Book b6 = new Book(7, "THE LAST LECTURE", 1700);

        Book[] books = { b1, b2, b3, b4, b5, b6 };

        System.out.println(Arrays.toString(books));

        // SORTING BOOKS
        Arrays.sort(books);
        System.out.println("AFTER SORTING......");

        System.out.println(Arrays.toString(books));
    }
}
