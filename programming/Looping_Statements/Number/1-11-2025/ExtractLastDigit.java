import java.util.Scanner;

public class ExtractLastDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int remainder = n % 10;

        System.out.println("Original number : " + n);
        System.out.println("Last digit extracted : " + remainder);
    }
}