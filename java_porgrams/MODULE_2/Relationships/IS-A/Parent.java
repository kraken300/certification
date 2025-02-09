public class Parent{
    static int i = 10; // STATIC VARIABLE (Parent)
    int a = 100; // NON-STATIC VARIABLE (Parent)

    public static void staticParent(){ // STATIC METHOD (Parent)
        System.out.println("FROM Parent CLASS");
    }

    public static void nonstaticParent(){ // NON-STATIC METHOD (Parent)
        System.out.println("FROM Parent CLASS");
    }

}