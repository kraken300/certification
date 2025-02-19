import java.util.Scanner;

//                                 15
//                         13      14
//                 10      11      12
//         6       7       8       9
// 1       2       3       4       5

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            temp = temp + i;
        }

        int x = temp - (num - 1);

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j >= num + 1) {
                    System.out.print(x + "\t");
                } 
                else {
                    System.out.print("\t");
                }
                x++;
            }
            x = x - num - i;
            System.out.println();
        }
    }
}