import java.util.Scanner;

public class FruitDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Outlet outlet = new Outlet();

        System.out.println("====ENTER CUSTOMER DETAILS====");
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        
        System.out.print("Enter Mobile Number : ");
        long mobile = sc.nextLong();
        outlet.customer = new Customer(id, mobile);

        int choice2 = '\u0000';
        do {
            System.out.println("\n\n====WELCOME TO FRUIT MARKET====");
            System.out.println("Enter 1 for Apple");
            System.out.println("Enter 2 for Mango");
            System.out.println("Enter 3 for Strawberry");
            System.out.print("Enter your choice : ");

            int choice1 = sc.nextInt();
            choice2 = '\u0000';

            switch (choice1) {
                case 1: {
                    System.out.print("Enter quantity : ");
                    outlet.fruit = new Apple(sc.nextInt());
                    break;
                }

                case 2: {
                    System.out.print("Enter quantity : ");
                    outlet.fruit = new Mango(sc.nextInt());
                    break;
                }

                case 3: {
                    System.out.print("Enter quantity : ");
                    outlet.fruit = new Strawberry(sc.nextInt());
                    break;
                }

                default:
                    System.out.println("****INVALID FRUIT NUMBER****");
                    System.out.print("Do you still want to buy a fruit ? (Y/N) : ");
                    choice2 = sc.next().charAt(0);
            }

        } while (choice2 == 'Y' || choice2 == 'y');

        outlet.customer.displayCustomer();
        outlet.displayCart(outlet.fruit);
        outlet.billGenerator(outlet.fruit);
        sc.close();
    }
}
