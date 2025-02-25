public abstract class Person {
    int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void purpose();

    public abstract void displayDetails();

    public void breath() {
        System.out.println("Every person can breath");
    }
}
