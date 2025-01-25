import java.util.Scanner;

public class PalindromeNumber {

    public static void isPalindromeNumber(int num) {

        int n = num;
        int reverse = 0;

        while (num > 0){
            int r = num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;
        }

        if(n == reverse){
            System.out.println("It is a palindrome number.");
        }
        else{
            System.out.println("It is not a palindrome number.");
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        isPalindromeNumber(n);

        sc.close();
    }
}
