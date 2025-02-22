import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int result = missingNumber(arr);
        System.out.println(result);

        sc.close();
    }

    public static int missingNumber(int[] arr) {

        if (arr.length == 1) {
            return -1;
        }

        int diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == diff) {
                continue;
            } 
            else {
                return arr[i + 1] - 1;
            }
        }

        return -1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}