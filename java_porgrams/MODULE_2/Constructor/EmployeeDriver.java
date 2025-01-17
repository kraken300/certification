import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();

        Employee e1 = new Employee(id, name, salary);

        e1.displayDetails();

        sc.close();
    }
}
