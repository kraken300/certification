import java.util.Scanner;

// *    
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 1; i <= (2 * num - 1); i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j && i + j <= 2 * num) {
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