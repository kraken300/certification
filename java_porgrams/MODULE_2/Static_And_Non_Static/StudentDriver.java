public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // STUDENT 1
        s1.id = 1;
        s1.name = "JOHN";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.college);
        System.out.println("====================");
        
        s1.id = 100;
        s1.college = "COEP";
        
        // STUDENT 2
        s2.id = 2;
        s2.name = "SMITH";
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.college);
        System.out.println("====================");
        
        // STUDENT 3
        s3.id = 3;
        s3.name = "ADAMS";
        System.out.println(s3.id);
        System.out.println(s3.name);
        System.out.println(s3.college);
        System.out.println("====================");
        
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.college);
    }
}
