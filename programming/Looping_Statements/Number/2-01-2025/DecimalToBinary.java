import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("The binary number is : " + decimalToBinary2(n));

        sc.close();
    }

    public static long decimalToBinary(int num) {

        long temp = 0;
        while (num > 0) {
            int r = num % 2;
            temp = temp * 10 + r;
            num = num / 2;
        }

        long binary = 0;
        while (temp > 0) {
            int r = (int) (temp % 10);
            binary = binary * 10 + r;
            temp = temp / 10;
        }

        return binary;
    }

    public static long decimalToBinary2(int num) {

        long binary = 0;
        long x = 1;

        while (num > 0) {
            int r = num % 2;
            binary = binary + x * r;
            num = num / 2;
            x = x * 10;
        }

        return binary;
    }
}
