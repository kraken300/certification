import java.util.Scanner;

public class BuzzNumber {

    public static boolean isBuzzNumber(int num) {
        if (num % 10 == 7 || num % 7 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isBuzzNumber(n)) {
            System.out.println(n + " is a Buzz Number");
        } 
        else {
            System.out.println(n + " is not a Buzz Number");
        }

        sc.close();
    }
}