import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printPattern(n);
        sc.close();
    }

    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1 || i == num || j == num || i == j || i + j == num + 1) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}