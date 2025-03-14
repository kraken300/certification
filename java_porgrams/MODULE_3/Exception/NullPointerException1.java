public class NullPointerException1 {
    public static void main(String[] args) {
        System.out.println("Start of main");
        NullPointerException1 n1 = new NullPointerException1();
        System.out.println(n1.hashCode());

        NullPointerException1 n2 = null;
        System.out.println(n2.hashCode());
        System.out.println("End of main");
    }
}
