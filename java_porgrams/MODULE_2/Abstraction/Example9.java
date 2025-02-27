public interface Example9 {
    int a = 20;
    static int b = 30;

    static {
        System.out.println("Static initializer");
    }

    {
        System.out.println("Non-static initializer");
    }
}

// Example9.java:5: error: initializers not allowed in interfaces
//     static {
//            ^
// Example9.java:9: error: initializers not allowed in interfaces
//     {
//     ^
// 2 errors
