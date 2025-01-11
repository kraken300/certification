import java.util.Scanner;

public class ProductOfIndividualDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int prod = 1;

        while(n != 0){
            int r = n % 10;
            prod = prod * r;
            n = n / 10;
        }

        System.out.println("Product of individual digits : " + prod);
    }
}