import java.util.Scanner;
import java.util.Arrays;

public class PassingArrayToMethod{

	public static void printArray(int[] array){
		System.out.print("[");
		for(int j = 0; j < array.length - 1; j++){
			System.out.print(array[j] + ", ");
		}
		System.out.print(array[array.length-1]+"]");
	}

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

		System.out.println("Inbuilt method to print array (Arrays.toString()) : " + Arrays.toString(arr));

		printArray(arr);
	}
}