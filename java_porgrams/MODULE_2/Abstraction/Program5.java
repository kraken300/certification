public abstract class Program5 {
    public static void display() {
        System.out.println("Concrete method");
    }

    public abstract static void test();
}


// Program5.java:6: error: illegal combination of modifiers: abstract and static
//     public abstract static void test();
//                                 ^
// 1 error