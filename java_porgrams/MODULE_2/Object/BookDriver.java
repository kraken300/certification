public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book();

        // assigning values
        b1.title = "Wings of Fire";
        b1.author = "Dr. APJ Abdul Kalam";

        System.out.println(b1.title);
        System.out.println(b1.author);

        System.out.println(b1);
    }
}