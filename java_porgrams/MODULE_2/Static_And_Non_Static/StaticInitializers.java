public class StaticInitializers {
    static int i = 0; // single line static initializer

    static{
        System.out.println("start of initializer - 1");
        i = 20;
        System.out.println(i);
        System.out.println("end of initializer - 1");
    }

    public static void main(String[] args) {
        System.out.println("start of main");
        System.out.println(StaticInitializers.i);
        System.out.println("end of main");
    }

    static{
        System.out.println("start of initializer - 2");
        i = 20000;
        System.out.println(i);
        System.out.println("end of initializer - 2");
    }
}
