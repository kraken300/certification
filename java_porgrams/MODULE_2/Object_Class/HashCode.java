public class HashCode {
    public static void main(String[] args) {
        HashCode h1 = new HashCode();
        HashCode h2 = new HashCode();

        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());

        HashCode h3 = h2;
        System.out.println(h3.hashCode());
    }
}