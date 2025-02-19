import java.util.Scanner;

// 15      14      13      12      11
//         10      9       8       7
//                 6       5       4
//                         3       2
//                                 1

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        int sum = 0;
        for (int i = num; i >= 1; i--) {
            sum = sum + i;
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i <= j) {
                    System.out.print(sum + "\t");
                    sum--;
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}