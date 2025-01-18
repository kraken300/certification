import java.util.Scanner;

public class StrongNumber {

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int n = num;

        while (num > 0) {
            int r = num % 10;

            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sum = sum + fact;

            num = num / 10;
        }

        if (sum == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isStrongNumber(n)) {
            System.out.println(n + " is a Strong Number");
        } 
        else {
            System.out.println(n + " is not a Strong Number");
        }

        sc.close();
    }
}
