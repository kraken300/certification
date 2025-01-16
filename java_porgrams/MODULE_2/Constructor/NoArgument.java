public class NoArgument {
    NoArgument(){
        System.out.println("Entering construtor");
        printMethod();
        System.out.println("Leaving constructor");
    }

    void printMethod(){
        System.out.println("This is a test print method");
    }
}
