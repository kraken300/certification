import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter power : ");
        int pow = sc.nextInt();

        int power = 1;

        if(pow == 0){
            System.out.println("Power of " + num + "^" + pow + " = " + power);
            return;
        }

        if(num == 0){
            power = 0;
            System.out.println("Power of " + num + "^" + pow + " = " + power);
            return;
        }

        for(int i = 1; i <= pow; i++){
            power = power * num;
        }

        System.out.println("Power of " + num + "^" + pow + " = " + power);
    }
}