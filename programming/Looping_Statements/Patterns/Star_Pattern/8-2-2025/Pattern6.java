import java.util.Scanner;

// *********
//  *******
//   *****
//    ***
//     *

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (2 * num - 1); j++) {
                if (i <= j && i + j <= 2 * num) {
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