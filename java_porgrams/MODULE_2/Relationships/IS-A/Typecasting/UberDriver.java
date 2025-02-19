import java.util.Scanner;

public class UberDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uber uber = new Uber();

        System.out.println("\n====Welcome to the Uber====\n");
        char choice2 = '\u0000';

        do {
            System.out.println("Press 1 For : SUV");
            System.out.println("Press 2 For : Sedan");
            System.out.println("Press 3 For : Mini");
            System.out.print("\n Enter your choice :  ");

            int choice1 = sc.nextInt();
            choice2 = '\u0000';

            switch (choice1) {
                case 1: {
                    System.out.print("Enter  distance : ");
                    uber.cab = new SUV(sc.nextInt()); // UPCASTED SCENARIO
                    break;
                }

                case 2: {
                    System.out.print("Enter  distance : ");
                    uber.cab = new Sedan(sc.nextInt()); // UPCASTED SCENARIO
                    break;
                }

                case 3: {
                    System.out.print("Enter  distance : ");
                    uber.cab = new SUV(sc.nextInt()); // UPCASTED SCENARIO
                    break;
                }

                default: {
                    System.out.println("\n====INVALID INPUT====\n");
                    System.out.println("\t Do you want to continue(Y/N)");
                    choice2 = sc.next().charAt(0);
                }
            }

        } while (choice2 == 'y' || choice2 == 'Y');

        // Displaying properties of cab selected
        Uber.displayDetails(uber.cab);
        sc.close();
    }
}
