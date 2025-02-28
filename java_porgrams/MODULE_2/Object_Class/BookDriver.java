public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book(1, "RUSKIN BOND", "THE STORIES BY RUSKIN BOND", 400);
        Book b2 = new Book(2, "WILLIAM SHAKESPEAR", "MERCHANT OF VENICE", 200);
        Book b3 = new Book(1, "RUSKIN BOND", "THE STORIES BY RUSKIN BOND", 400);

        System.out.println("=========");
        System.out.println(b1);
        System.out.println(b2);

        // for hashCode()
        System.out.println("=========");
        System.out.println(b1 == b3);
        System.out.println(b1 == b2);

        System.out.println("==========");
        System.out.println(b1.hashCode() == b3.hashCode());

        // for toString()
        System.out.println(b1.toString());
        System.out.println(b1);

        System.out.println("==========");
        System.out.println(b1 == b3);
        System.out.println(b1);
        System.out.println(b3);

        System.out.println("==========");
        System.out.println(b1.equals(b3));
    }
}
