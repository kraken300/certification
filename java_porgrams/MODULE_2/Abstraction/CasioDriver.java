import java.util.Scanner;

public class CasioDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Casio();

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
                    calc.displayResult(num1, num2, choice);
                    break;

                case 2:
                    calc.displayResult(num1, num2, choice);
                    break;

                case 3:
                    calc.displayResult(num1, num2, choice);
                    break;

                case 4:
                    calc.displayResult(num1, num2, choice);
                    break;

                default:
                    break;
            }

        } while (choice2 == 'Y' || choice2 == 'y');

        sc.close();
    }
}
