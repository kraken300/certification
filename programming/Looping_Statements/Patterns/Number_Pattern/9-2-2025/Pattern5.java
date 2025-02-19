import java.util.Scanner;

// 1
// 0       1
// 1       0       1
// 0       1       0       1
// 1       0       1       0       1

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(1 + "\t");
                    } else {
                        System.out.print(0 + "\t");
                    }
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}