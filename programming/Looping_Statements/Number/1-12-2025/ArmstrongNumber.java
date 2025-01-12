import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int temp1 = n;
        int temp2 = n;
        int pow = 0;
        int sum = 0;

        while(temp1 > 0){
            pow = pow + 1;
            temp1 = temp1 / 10;
        }

        while(temp2 > 0){
            int r = temp2 % 10;

            int prod = 1;
            for(int i = 1; i <= pow; i++){
                prod = prod * r;
            }
            sum = sum + prod;

            temp2 = temp2 / 10;
        }

        if(n == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

        System.out.println(n);
        System.out.println(sum);

    } 
}