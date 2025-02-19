import java.util.Scanner;

public class ReverseEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element : ");
            arr[i] = sc.nextInt();
        }

        reverseEachElement(arr);
        // printArray(arr);

        sc.close();
    }

    public static void reverseEachElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int reverse = 0;

            while (arr[i] > 0) {
                int remainder = arr[i] % 10;
                reverse = reverse * 10 + remainder;
                arr[i] = arr[i] / 10;
            }

            arr[i] = reverse;
            System.out.print(arr[i] + "    ");
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}
