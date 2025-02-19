import java.util.Scanner;

// 1
// 2       1
// 3       2       1
// 4       3       2       1
// 5       4       3       2       1

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
            for (int j = i; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(j + "\t");
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}