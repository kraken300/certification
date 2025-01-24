public class NonStaticInitializers {

    int i = 10; // single line non-static initializer
    String str = "hi"; // single line non-static initializer

    {
        System.out.println("start of non-static initializer - 1");
        i = 200;
        str = "hello";
        System.out.println(i + "\t" + str);
        System.out.println("end of non-static initializer - 1");
    }

    public NonStaticInitializers(){
        System.out.println("start of constructor()");
        i = 4;
        str = "java";
        System.out.println(i + "\t" + str);
        System.out.println("end of constructor()");
    }

    public NonStaticInitializers(int i, String str){
        this();
        System.out.println("start of constructor(int, String)");
        this.i = i;
        this.str = str;
        System.out.println(i + "\t" + str);
        System.out.println("end of constructor(int, String)");
    }

    public static void main(String[] args) {
        System.out.println("start of main");
        NonStaticInitializers o1 = new NonStaticInitializers(100000, "ABCD");
        // NonStaticInitializers o2 = new NonStaticInitializers(100000, "ABCD");
        System.out.println("end of main");
    }

    {
        System.out.println("start of non-static initializer - 2");
        i = 10000;
        str = "world";
        System.out.println(i + "\t" + str);
        System.out.println("end of non-static initializer - 2");
    }
}
