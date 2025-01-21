import java.util.Scanner;

public class LaptopDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID of the laptop : ");
        int pid = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Model of the laptop : ");
        String model = sc.nextLine();
        
        System.out.print("Enter Brand of the laptop : ");
        String brand = sc.nextLine();

        System.out.print("Enter Price of the laptop : ");
        double price = sc.nextDouble();

        Laptop l1 = new Laptop(pid, model, brand, price);
        l1.displayLaptopDetails();

        sc.close();
    }   
}
