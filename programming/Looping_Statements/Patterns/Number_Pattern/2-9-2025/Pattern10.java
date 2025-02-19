import java.util.Scanner;

//                                 5
//                         5       4
//                 5       4       3
//         5       4       3       2
// 5       4       3       2       1

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            // int sum = i;
            int temp = num;
            for (int j = 1; j <= num; j++) {
                if (i + j >= num + 1) {
                    System.out.print(temp + "\t");
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