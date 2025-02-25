public class Employee extends Person {
    int id;
    String company;

    public Employee() {
        super();
    }

    public Employee(int id, String company, int age, String name) {
        super(age, name);
        this.id = id;
        this.company = company;
    }

    public void work() {
        System.out.println("Employees are working.");
    }

    @Override
    public void purpose() {
        this.work();
    }

    @Override
    public void displayDetails() {
        System.out.println("====EMPLOYEE DETAILS====");
        System.out.println("ID : " + this.id);
        System.out.println("COMPANY : " + this.company);
        System.out.println("AGE : " + super.age);
        System.out.println("NAME : " + super.name);
    }
}
