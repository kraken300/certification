public class Student extends Person {
    int rollno;
    String school;

    public Student() {
        super();
    }

    public Student(int rollno, String school, int age, String name) {
        super(age, name);
        this.rollno = rollno;
        this.school = school;
    }

    public void study() {
        System.out.println("Students are studying.");
    }

    @Override
    public void purpose() {
        this.study();
    }

    @Override
    public void displayDetails() {
        System.out.println("====STUDENT DETAILS====");
        System.out.println("ROLL NO : " + this.name);
        System.out.println("SCHOOL : " + this.school);
        System.out.println("AGE : " + super.age);
        System.out.println("NAME : " + super.name);
    }
}
