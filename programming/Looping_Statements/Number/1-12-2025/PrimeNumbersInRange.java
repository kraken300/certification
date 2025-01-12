import java.util.Scanner;

public class PrimeNumbersInRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number : ");
        int m = sc.nextInt();

        System.out.print("Enter end number : ");
        int n = sc.nextInt();

        for(int i = m; i <= n; i++){
            boolean flag = true;
            
            for(int j = 2; j < i/2; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.print(i + " ");
            }
        }
    } 
}