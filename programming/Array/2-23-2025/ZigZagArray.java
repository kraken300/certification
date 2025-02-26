import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size for the array 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element : ");
            arr2[i] = sc.nextInt();
        }

        printArray(zigZagArray(arr1, arr2));

        sc.close();
    }

    public static int[] zigZagArray(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        int n = 0;
        if (arr1.length < arr2.length) {
            n = arr1.length;
        } 
        else {
            n = arr2.length;
        }

        while (n > 0) {
            merged[k++] = arr1[i++];
            merged[k++] = arr2[j++];
            n--;
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
