import java.util.Scanner;

public class MonotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        boolean result = isMonotonicArray(arr);
        System.out.println("Monotonic Array: " + result);

        sc.close();
    }

    public static boolean isMonotonicArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            }

            else {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] >= arr[j + 1]) {
                        continue;
                    } 
                    else {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
