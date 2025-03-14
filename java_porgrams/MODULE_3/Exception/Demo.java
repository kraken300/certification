public class Demo {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("java");

        int a = 10;
        int b = 0;
        int res = 0;

        res = div(a, b);

        System.out.println("result : " + res);
        System.out.println("Bye");
    }

    public static int div(int a, int b) {
        System.out.println("method start");
        int result = test(a, b);
        System.out.println("method end");
        return result;
    }

    public static int test(int a, int b) {
        return a / b;
    }
}
