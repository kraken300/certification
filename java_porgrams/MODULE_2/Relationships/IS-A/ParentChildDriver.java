public class ParentChildDriver {
    public static void main(String[] args) {

        // ACCESSING DECLARED MEMBERS
        // System.out.println(Parent.i); //10
        // System.out.println(Child.j); //20
        // Parent.staticParent();
        // Child.staticChild();
        // Parent p1 = new Parent();
        // System.out.println(p1.a); //100
        // p1.nonstaticParent();

        // Child c1 = new Child();
        // System.out.println(c1.b); //200
        // c1.nonstaticChild();

        // ACCESSING INHERITED MEMBERS
        // System.out.println(Child.i); //10
        // Child.staticParent();
        // Child c2 = new Child();
        // System.out.println(c2.a); //100
        // c2.nonstaticParent();

        /*
         * NOTE :
         * 1. All the static variables of Parent class are inherited to Child class.
         * 2. Inherited static variables can be accessed by using:
         * 2.1 Parent class name as reference.
         * 2.2 Child class name as referenece.
         */

        /*
         * NOTE :
         * 1. All the static methods of Parent class are inherited to Child class.
         * 2. Inherited static methods can be accessed by using:
         * 2.1 Parent class name as reference.
         * 2.2 Child class name as referenece.
         */

        /*
         * NOTE:
         * 1. All the non-staic variables of Parent class are inherited to Child class.
         * 2. Inherited non-static variable can be accessed by using:
         * 2.1 Parent class object as reference.
         * 2.2 Child class object as reference.
         */

        /*
         * NOTE:
         * 1. All the non-staic methods of Parent class are inherited to Child class.
         * 2. Inherited non-static methods can be accessed by using:
         * 2.1 Parent class object as reference.
         * 2.2 Child class object as reference.
         */

        // ACCESSING MEMBERS THROUGH PARENT CLASS NAME AS REFERENCE
        System.out.println(Parent.i); // static variables of Parent class
        Parent.staticParent(); // static methods of Parent class

        // ACCESSING MEMBERS THROUGH CHILD CLASS NAME AS REFERENCE
        System.out.println(Child.i); // static variables of Parent class
        System.out.println(Child.j); // static variables of Child class
        Child.staticParent(); // static methods of Parent class
        Child.staticChild(); // static methods of Child class

        // ACCESSING MEMBERS THROUGH PARENT CLASS OBJECT AS REFERENCE
        Parent p = new Parent();
        System.out.println(p.a); // non-static variables of Parent class
        System.out.println(p.i); // static variables of Parent class
        p.nonstaticParent(); // non-static methods of Parent class
        p.staticParent(); // static methods of Parent class

        // ASSESSING MEMBERS THROUGH CHILD CLASS OBJECT AS REFERENCE
        Child c = new Child();
        System.out.println(c.a); // non-static variables of Parent class
        System.out.println(c.b); // non-static variables of Child class
        System.out.println(c.i); // static variables of Parent class
        System.out.println(c.j); // static variables of Child class
        c.nonstaticChild(); // non-static methods of Child class
        c.nonstaticParent(); // non-static methods of Parent class
        c.staticChild(); // static methods of Child class
        c.staticParent(); // static methods of Parent class
    }
}
