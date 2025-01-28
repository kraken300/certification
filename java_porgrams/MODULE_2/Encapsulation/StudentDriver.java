public class StudentDriver {
    public static void main(String[] args){
        Student s1 = new Student("JOHN", 12, 10);

        System.out.println("NAME : " + s1.getName());
        System.out.println("ROLL NO : " + s1.getRollNo());
        System.out.println("STANDARD : " + s1.getStandard());
    }
}
