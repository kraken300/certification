public class Child extends Parent {
    static int j = 20; // STATIC VARIABLE (Child)
    int b = 200; // NON-STATIC VARIABLE (Child)

    public static void staticChild() { // STATIC METHOD (Child)
        System.out.println("FROM Child CLASS");
    }

    public void nonstaticChild() { // NON-STATIC METHOD (Child)
        System.out.println("FROM Child CLASS");
    }

}