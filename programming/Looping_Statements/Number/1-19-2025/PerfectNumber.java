import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " is a Perfect Number");
        } 
        else {
            System.out.println(n + " is not a Perfect Number");
        }

        sc.close();
    }
}
