public class ObjectLoading {
    // 0x1
    static int i = 10;
    // 0x2
    int a = 20;

    // 0x3
    static{
        System.out.println("start of SI - 1");
        i = 100;
        System.out.println(i);
        System.out.println("end of SI - 1");
    }

    // 0x4
    {
        System.out.println("start of NSI - 1");
        a = 200;
        System.out.println(i + "\t" + a);
        System.out.println("end of NSI - 1");
    }

    // 0x5
    ObjectLoading(){
        System.out.println("constructor()");
    }

    // 0x6
    ObjectLoading(int a){
        this();
        System.out.println("start of constructor(int)");
        this.a = a;
        i = 1000;
        System.out.println(i + "\t" + a);
        System.out.println("end of constructor(int)");
    }

    // 0x7
    public static void main(String[] args) {
        System.out.println("start of main");
        ObjectLoading o1 = new ObjectLoading(20000);
        System.out.println("end of main");
    }

    // 0x8
    static{
        System.out.println("start of SI - 2");
        i = 100000;
        System.out.println(i);
        System.out.println("end of SI - 2");
    }

    // 0x9
    {
        System.out.println("start of NSI - 2");
        a = 20000;
        System.out.println(i + "\t" + a);
        System.out.println("end of NSI - 2");
    }
}
