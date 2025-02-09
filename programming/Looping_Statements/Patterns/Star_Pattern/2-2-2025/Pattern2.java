import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        straightLine(n);

        sc.close();
    }

    public static void straightLine(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(" * ");
        }
    }
}