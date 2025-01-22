public class Student{
    int id;
    String name;
    static String college = "KGCE";

    // NON-STATIC CONTEXT
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
        System.out.println(Student.college);
    }

    // STATIC CONTEXT
    // public static void main(String[] args) {
    //     Student s1 = new Student();

    //     // NON-STATIC VARIABLES
    //     System.out.println(s1.id);
    //     System.out.println(s1.name);
    //     System.out.println(s1.college);

    //     // STATIC VARIABLES
    //     System.out.println(college);
    //     System.out.println(Student.college);
    // }
}