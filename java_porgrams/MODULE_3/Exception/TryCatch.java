public class TryCatch {
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
        try {
            return a / b;
        } 
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Cannot divide by zero");
            // System.exit(0);
            return 0;
        }
    }
}
