import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int fact = 1;

        if(num == 0){
            System.out.println(0 + "! = " + fact);
            return;
        }

        if(num < 0){
            System.out.println("Invalid number!");
            return;
        }

        for(int i = num; i > 0; i--){
            fact = fact * i;
        }

        // while(num > 0){
        //     fact = fact * num;
        //     num--;
        // }

        System.out.println(num + "! = " + fact);
    }
}