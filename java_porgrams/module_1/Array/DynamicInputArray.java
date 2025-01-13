import java.util.Scanner;

public class DynamicInputArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// taking array size
		System.out.print("Enter the size for an array : ");
		int size = sc.nextInt();

		// creating the array
		int[] arr = new int[size];

		// inserting elements into the array
		for(int i = 0; i < arr.length; i++){
			System.out.print("Enter arr[" + i + "] element : ");
			arr[i] = sc.nextInt();
		}

		// printing the array
		System.out.print("The array is : ");
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[j] + " ");
		}

	}
}