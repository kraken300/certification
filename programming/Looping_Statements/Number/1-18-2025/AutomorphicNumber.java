import java.util.Scanner;

public class AutomorphicNumber {

    // public static boolean isAutomorphicNumber1(int num) {
    // int square = num * num;
    // boolean flag = false;

    // while (num > 0) {
    // int ld_num = num % 10;
    // int ld_square = square % 10;

    // if (ld_num == ld_square) {
    // flag = true;
    // }
    // else {
    // flag = false;
    // break;
    // }

    // num = num / 10;
    // square = square / 10;
    // }
    // return flag;
    // }

    public static boolean isAutomorphicNumber2(int num) {
        // int n = num;
        int div = 1;

        for (int i = num; i > 0; i = i / 10) {
            div = div * 10;
        }

        int ld_square = (num * num) % div;

        return num == ld_square;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isAutomorphicNumber2(n)) {
            System.out.println(n + " is an Automorphic Number");
        } 
        else {
            System.out.println(n + " is not an Automorphic Number");
        }

        sc.close();
    }
}