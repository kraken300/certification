import java.util.Scanner;

// 1
// 2       6
// 3       7       10
// 4       8       11      13
// 5       9       12      14      15

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            int sum = i;
            int temp = num - 1;
            for (int j = 1; j <= num; j++) {
                if (i >= j) {
                    System.out.print(sum + "\t");
                    sum = sum + temp;
                    temp--;
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}