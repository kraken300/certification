public class Student {
    String name;
    int roll_no;

    public Student(String s, int r){
        name = s;
        roll_no = r;
    }

    void printDetails(){
        System.out.println("Name : " + name + ", Roll no : " +roll_no);
    }

    void study(){
        System.out.println("Student is studying!");
    }
}
