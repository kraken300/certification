import java.util.Scanner;

public class AverageOfArrayElements{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// taking array size
		System.out.print("Enter the size for an array : ");
		int size = sc.nextInt();

		// creating the array
		int[] arr = new int[size];

		int sum = 0;

		// inserting elements into the array
		for(int i = 0; i < arr.length; i++){
			System.out.print("Enter arr[" + i + "] element : ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		double average = (sum / arr.length);
		System.out.println("The average is : " + average);

	}
}