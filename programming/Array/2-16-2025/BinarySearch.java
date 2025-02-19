import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] key : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a key to search : ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);
        System.out.println("Key " + key + " is present at index " + index);
        // printArray(arr);

        sc.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (key == arr[mid]) {
                return mid;
            }

            else if (key < arr[mid]) {
                j = mid - 1;
            }

            else if (key > arr[mid]) {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}
