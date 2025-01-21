import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile id : ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter mobile type (Android or Iphone) : ");
        String type = sc.nextLine();

        System.out.print("Enter mobile brand : ");
        String brand = sc.nextLine();

        System.out.print("Enter mobile model : ");
        String model = sc.nextLine();        

        System.out.print("Enter mobile ram (GB) : ");
        int ram = sc.nextInt();
        
        System.out.print("Enter mobile rom (GB) : ");
        int rom = sc.nextInt();

        System.out.print("Enter mobile camera quality (MP) : ");
        int camera = sc.nextInt();

        System.out.print("Enter mobile charging_speed (Watts) : ");
        int charging_speed = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter mobile processor : ");
        String processor = sc.nextLine();

        System.out.print("Enter mobile display quality : ");
        String display = sc.nextLine();

        System.out.print("Enter mobile sim_card type (4G or 5G) : ");
        String sim_card = sc.nextLine();

        System.out.print("Enter mobile price : ");
        double price = sc.nextDouble();

        Mobile m1 = new Mobile(id, type, brand, model, ram, rom, camera, charging_speed, processor, display, sim_card, price);

        m1.displayDetails();
        
        sc.close();
    }
}


// int id, String type, String brand, String model, int ram, int rom, int camera, int charging_speed, String processor, String display, String sim_card, double price