import java.util.Scanner;

public class PrintEvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter end number : ");
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // for(int i = n1; i <= n2 && i%2 == 0; i++){
        //     System.out.println(i);
        // }
        // Not working
    }
}