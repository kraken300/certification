public abstract class Program7 {
    int a = 20;
    static int b = 30;

    static {
        System.out.println("Static initializer");
    }

    {
        System.out.println("Non-static initializer");
    }
}
