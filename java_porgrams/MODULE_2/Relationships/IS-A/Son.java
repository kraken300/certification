public class Son extends Father{
    String name;

    public Son(String sname, String fname) {
        this.name = sname;
        super.name = fname;
    }

    public void displayParentChild() {
        System.out.println("Father's name : " + super.name);
        System.out.println("Child's name : " + this.name);
    }
}
