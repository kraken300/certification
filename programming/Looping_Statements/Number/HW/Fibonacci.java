import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacciNumber(int num){
        int a = -1;
        int b= 1;
        int c;

        for(int i = 1; i<=num; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printFibonacciNumber(n);

        sc.close();
    }
}
