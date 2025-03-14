import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Student> set = new LinkedHashSet<>();

        Student s1 = new Student(1, "JOHN");
        Student s2 = new Student(2, "WILLIAM");
        Student s3 = new Student(3, "MIKE");
        Student s4 = new Student(4, "ADAMS");
        Student s5 = new Student(1, "JOHN");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
        System.out.println(set.contains(s1));
        System.out.println(set.contains(s2));
        System.out.println(set.contains(s3));
        System.out.println(set.contains(s4));
        System.out.println(set.contains(s5));
    }
}
