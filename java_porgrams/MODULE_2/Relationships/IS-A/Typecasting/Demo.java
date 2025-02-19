public class Demo{
    public static void main(String[] args){
        A a = new A();

        // UPCASTING
        A a2 = new X();
        A a3 = new Y();
        A a4 = new Z();

        /*
         * instanceof OPERATOR 
         * SYNTAX:
         * Reference_variable instanceof ClassName
         * 
         * 1. It's a Binary Operator.
         * 2. Return Type : boolean
         */

        System.out.println(a4 instanceof Z);
        System.out.println(a4 instanceof A);
        System.out.println(a4 instanceof Object);
        System.out.println(a4 instanceof X);
        // System.out.println(a4 instanceof Demo);

        /*
         * 
         * NOTE :
         * 
         */

        System.out.println(a4.a);
        // System.out.println(a4.z);

        /*
         * After performing the upcating, we can access the members of Parent class 
         * and not Child class members.
         */

        /*
         * DOWNCASTING: 
         * The process of converting parent type reference to child type
         * reference is referred as Downcasting.
         * 
         * 1. We can perferom downcasting Explicitly.

         * 2. PURPOSE OF DOWNCASTING:
         * to access the members of child class after performing upcasting.
         * ------> SPECIALIZATION
         *
         * 3. SYNTAX: 
         * ( Target_Type ) Object_Reference
         */

        // Downcasting the reference
        A a5 = new Z(); // UPCASTED SCENARIO
        Z z1 = (Z) a5; // DOWNCASTED SCENARIO
        System.out.println(z1.z);
        System.out.println(z1.a);

        // Scenario-2
        A a6 = new Y();
        Y y1 = (Y) a6;
        System.out.println(y1.y);
        System.out.println(((Y) a6).y);

        /*
         * 
         * ClassCastException
         * When we try to access sub class members after performing
         * downcasting of super type reference to a
         * sub type reference and instance of that particular
         * sub type is not present in the Object, then we get an
         * exception referred as ClassCastException.
         */

        A a10 = new X();
        Z z10 = (Z) a10;
        System.out.println(z10.z);
    }
}

class A{
    int a = 10;
}

class X extends A{
    int x = 5;
}

class Y extends A{
    int y = 15;
}

class Z extends A{
    int z = 25;
}