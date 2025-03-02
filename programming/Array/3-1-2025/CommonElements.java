import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        int[] arr2 = { 3, 1, 4, 1, 5, 9, 2 };

        mergedArray(arr1, arr2);

        sc.close();
    }

    public static void mergedArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int key = Integer.MIN_VALUE;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    key = arr1[i];
                    arr2[j] = Integer.MIN_VALUE;
                }
            }
            if (key != Integer.MIN_VALUE) {
                System.out.println(key);
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
