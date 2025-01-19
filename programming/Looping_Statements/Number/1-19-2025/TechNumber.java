import java.util.Scanner;

public class TechNumber {

    public static boolean isTechNumber(int num) {
        int digits = 0;
        int n = num;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        int div = 1;
        for (int i = digits / 2; i > 0; i--) {
            div = div * 10;
        }

        int sum_last = n % div;
        int sum_first = n / div;

        int square = sum_first + sum_last;
        square = square * square;

        if (square == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isTechNumber(n)) {
            System.out.println(n + " is a Tech Number");
        } 
        else {
            System.out.println(n + " is not a Tech Number");
        }

        sc.close();
    }
}
