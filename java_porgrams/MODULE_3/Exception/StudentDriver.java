public class StudentDriver {
    // public static void main(String[] args) throws StudentAgeException {
    // Student s1 = new Student(1, "JOHN", 20);
    // Student s2 = new Student(2, "SMITH", 20);
    // Student s3 = new Student(3, "MIKE", 22);
    // Student s4 = new Student(3, "JACK", 24);

    // System.out.println(s1);
    // System.out.println(s2);
    // System.out.println(s3);
    // System.out.println(s4);
    // }

    public static void main(String[] args) {
        Student s1 = null;
        try {
            s1 = new Student(1, "JOHN", -20);
            System.out.println(s1);
        } 
        catch (StudentAgeException e) {
            e.printStackTrace();
        }
        // Student s2 = new Student(2, "SMITH", 20);
        // Student s3 = new Student(3, "MIKE", 22);
        // Student s4 = new Student(3, "JACK", 24);

    }
}
