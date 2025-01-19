import java.util.Scanner;

public class XylemPhloemNumber {
    public static boolean isXylemPhloem1(int num) {
        int digits = 0;
        int n1 = num;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        int extreme_sum = 0;
        int mid_sum = 0;
        for (int i = 1; i <= digits; i++) {

            int r = n1 % 10;

            if (i == 1 || i == digits) {
                extreme_sum = extreme_sum + r;
            } 
            else {
                mid_sum = mid_sum + r;
            }

            n1 = n1 / 10;
        }

        if (extreme_sum == mid_sum) {
            return true;
        }
        return false;
    }

    public static boolean isXylemPhloem2(int num) {
        int inner_sum = 0;
        int outer_sum = 0;

        outer_sum = num % 10;
        num = num / 10;

        while (num > 9) {
            int r = num % 10;
            inner_sum = inner_sum + r;
            num = num / 10;
        }

        outer_sum = outer_sum + num;

        return outer_sum == inner_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isXylemPhloem2(n)) {
            System.out.println(n + " is a Xylem Number");
        } else {
            System.out.println(n + " is a Phloem Number");
        }

        sc.close();
    }
}
