import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isUniqueNumber2(n)) {
            System.out.println(n + " is a Unique number");
        } else {
            System.out.println(n + " is not a Unique number");
        }

        sc.close();
    }

    public static boolean isUniqueNumber(int num) {

        int count = 0;
        int n = num;
        int temp = num;

        while (num > 0) {
            int r1 = num % 10;

            count = 0;
            n = temp;
            while (n > 0) {
                int r2 = n % 10;

                if (r1 == r2) {
                    count++;
                }

                if (count > 1) {
                    return false;
                }
                n = n / 10;
            }
            num = num / 10;
        }
        return true;
    }

    public static boolean isUniqueNumber2(int num) {

        while (num > 0) {
            int r1 = num % 10;
            num = num / 10;
            int n = num;
            while (n > 0) {
                int r2 = num % 10;
                if (r1 == r2) {
                    return false;
                }
                n = n / 10;
            }
        }
        return true;
    }
}