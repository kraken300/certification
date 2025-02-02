import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long n = sc.nextLong();

        System.out.println("The decimal number is : " + binaryToDecimal(n));

        sc.close();
    }

    public static int binaryToDecimal(long num) {
        int count = 0;
        int decimal = 0;

        while (num > 0) {
            int r = (int) (num % 10);

            int temp = 1;
            for (int i = 0; i < count; i++) {
                temp = temp * 2;
            }

            decimal = decimal + r * temp;
            count++;
            num = num / 10;
        }
        return decimal;
    }

    // public static int binaryToDecimal2(long num) {
    // int count = 0;
    // int decimal = 0;

    // while (num > 0) {
    // int r = (int) (num % 10);

    // decimal = decimal + powerOfTwo(r);
    // count++;
    // num = num / 10;
    // }
    // return decimal;
    // }

    // public static int powerOfTwo(int n) {
    // int temp = 1;
    // for (int i = 0; i < n; i++) {
    // temp = temp * 2;
    // }
    // return temp;
    // }
}
