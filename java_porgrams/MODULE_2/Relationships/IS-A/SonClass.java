public class SonClass extends FatherClass {
    String name;

    public SonClass(String sname, String fname) {
        super(fname);
        this.name = sname;
        // super.name = fname;
    }

    public void displayParentChild() {
        System.out.println("Father's name : " + super.name);
        System.out.println("Child's name : " + this.name);
    }
}
