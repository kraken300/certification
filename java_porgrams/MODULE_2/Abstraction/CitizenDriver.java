import java.util.Scanner;

public class CitizenDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Citizen();

        int choice2 = '\u0000';

        do {
            choice2 = '\u0000';

            System.out.print("Enter num1 : ");
            int num1 = sc.nextInt();

            System.out.print("Enter num2 : ");
            int num2 = sc.nextInt();

            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + calc.sub(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + calc.mul(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + calc.div(num1, num2));
                    break;

                default:
                    System.out.println("Invalid Input");
                    System.out.println("Do you still want to continue? (Y/N)");
                    choice2 = sc.next().charAt(0);
            }

        } while (choice2 == 'Y' || choice2 == 'y');

        sc.close();
    }
}
