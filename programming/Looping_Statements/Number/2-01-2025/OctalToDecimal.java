import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("The decimal number is : " + octalToDecimal(n));

        sc.close();
    }

    public static int octalToDecimal(int num) {
        int count = 0;
        int decimal = 0;

        while (num > 0) {
            int r = num % 10;

            int temp = 1;
            for (int i = 0; i < count; i++) {
                temp = temp * 8;
            }

            decimal = decimal + r * temp;
            count++;
            num = num / 10;
        }
        return decimal;
    }
}
