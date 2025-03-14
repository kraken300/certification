import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student2> students = new TreeSet<>();

        Student2 s1 = new Student2(1, "JOHN");
        Student2 s2 = new Student2(2, "WILLIAM");
        Student2 s3 = new Student2(3, "MIKE");
        Student2 s4 = new Student2(4, "ADAMS");
        Student2 s5 = new Student2(1, "JOHN");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students);
        System.out.println(students.contains(s1));
        System.out.println(students.contains(s2));
        System.out.println(students.contains(s3));
        System.out.println(students.contains(s4));
        System.out.println(students.contains(s5));
    }
}
