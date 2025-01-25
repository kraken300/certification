import java.util.Scanner;

public class NthPrime {

    public static void printNthPrimeNumber(int num) {
        int count = 0;
        for (int i = 2; i > 0; i++) {
            boolean flag = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count = count + 1;
                if (count == num) {
                    System.out.print("The " + num + "(nd/th) prime is " + i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printNthPrimeNumber(n);

        sc.close();
    }
}
