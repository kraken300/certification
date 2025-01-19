import java.util.Scanner;

public class NeonNumber {

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int r = square % 10;
            sum = sum + r;
            square = square / 10;
        }

        if (num == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isNeonNumber(n)) {
            System.out.println(n + " is a Noen Number");
        } 
        else {
            System.out.println(n + " is not a Neon Number");
        }

        sc.close();
    }
}
