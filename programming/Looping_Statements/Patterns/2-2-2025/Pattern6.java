import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        secondaryDiagonal(n);

        sc.close();
    }

    public static void secondaryDiagonal(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1) {
                    System.out.print(" * ");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}