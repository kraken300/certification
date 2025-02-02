import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        swapTwoNumbers(a, b);

        sc.close();
    }

    public static void swapTwoNumbers(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("a : " + b);
    }

    public static void swapTwoNumbers2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("a : " + b);
    }

    public static void swapTwoNumbers3(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("a : " + b);
    }
}
