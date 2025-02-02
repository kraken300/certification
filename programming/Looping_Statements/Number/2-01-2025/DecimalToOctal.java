import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("The octal number is : " + decimalToOctal(n));

        sc.close();
    }

    public static long decimalToOctal(int num) {

        int temp = 0;
        while (num > 0) {
            int r = num % 8;
            temp = temp * 10 + r;
            num = num / 8;
        }

        int octal = 0;
        while (temp > 0) {
            int r = temp % 10;
           octal =octal * 10 + r;
            temp = temp / 10;
        }

        return octal;
    }
}
