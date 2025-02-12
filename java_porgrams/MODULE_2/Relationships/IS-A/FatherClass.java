public class FatherClass extends Object {
    String name;

    public FatherClass() {

    }

    public FatherClass(String name) {
        this.name = name;
    }

    public void displayParent() {
        System.out.println("Father's name : " + this.name);
    }
}
