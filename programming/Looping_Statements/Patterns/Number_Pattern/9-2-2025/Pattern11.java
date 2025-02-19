import java.util.Scanner;

//                                 1
//                         6       2
//                 10      7       3
//         13      11      8       4
// 15      14      12      9       5

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        int temp = 0;
        for (int i = 1; i < num; i++) {
            temp = temp + i;
        }

        int a = 0;
        for (int i = 1; i <= num; i++) {
            a = temp + i;
            for (int j = 1; j <= num; j++) {
                if (i + j >= num + 1) {
                    System.out.print(a + "\t");
                } 
                else {
                    System.out.print("\t");
                }
                a = a - j;
            }
            System.out.println();
        }
    }
}