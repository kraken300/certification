import java.util.Scanner;

public class SpyNumber {

    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int prod = 1;

        while (num > 0) {
            int r = num % 10;
            sum = sum + r;
            prod = prod * r;
            num = num / 10;
        }

        // if(sum == prod){
        // return true;
        // }
        // return false;
        return sum == prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isSpyNumber(n)) {
            System.out.println(n + " is a Spy Number");
        } 
        else {
            System.out.println(n + " is not a Spy Number");
        }

        sc.close();
    }
}
