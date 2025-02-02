import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long n = sc.nextLong();

        if (isEvilNumber(n)) {
            System.out.println(n + " is an Evil number");
        } else {
            System.out.println(n + " is not an Evil number");
        }

        sc.close();
    }

    public static boolean isEvilNumber(long num) {
        int count = 0;

        while (num > 0) {
            int r = (int) (num % 10);
            if (r == 1) {
                count++;
            }
            num = num / 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
