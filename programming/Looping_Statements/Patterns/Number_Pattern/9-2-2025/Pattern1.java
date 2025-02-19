import java.util.Scanner;

// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j) {
                    count++;
                    System.out.print(count + "\t");
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}