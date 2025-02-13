public class PenBookDriver {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Book b1 = new Book();

        System.out.println(p1);
        System.out.println(b1);

        // Possible only if Pen extends Book
        Book b2 = p1;
    }

}
