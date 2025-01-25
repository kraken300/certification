import java.util.Scanner;

public class ReverseNumber {

    public static void printReverseNumber(int num) {

        int reverse = 0;

        while (num > 0){
            int r = num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;
        }

        System.out.println("The reverse number is : " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printReverseNumber(n);

        sc.close();
    }
}
