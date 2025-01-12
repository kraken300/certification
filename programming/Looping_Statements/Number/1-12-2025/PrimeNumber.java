import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid number");
            return;
        }
        
        if(n == 1){
            System.out.println("Coprime number");
            return;
        }

        // CASE 1
        // int count = 0;
        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0){
        //         count = count + 1;
        //     }
        // }

        // if(count == 2){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a Prime number");
        // }

        // CASE 2
        // int count = 0;
        // for(int i = 2; i < n; i++){
        //     if(n % i == 0){
        //         count = count + 1;
        //     }
        // }

        // if(count == 0){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a Prime number");
        // }

        // CASE 3
        // int count = 0;
        // for(int i = 2; i < n; i++){
        //     if(n % i == 0){
        //         count++;
        //         break;
        //     }
        // }

        // if(count == 0){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a Prime number");
        // }

        // CASE 4
        // int count = 0;
        // for(int i = 2; i < n/2; i++){
        //     if(n % i == 0){
        //         count++;
        //         break;
        //     }
        // }

        // if(count == 0){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a Prime number");
        // }

        // CASE 5
        boolean flag = true;
        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    } 
}