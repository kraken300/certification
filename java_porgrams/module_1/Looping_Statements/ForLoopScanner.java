import java.util.Scanner;

public class ForLoopScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start number : ");
		int n1 = sc.nextInt();

		System.out.print("Enter end number : ");
		int n2 = sc.nextInt();	

		System.out.println("The even numbers between " + n1 + " and "+ n2 + " are as follows: ");
		for(int i = n1;i <= n2; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
}