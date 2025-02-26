import java.util.Scanner;

public class MergedArray {
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

        printArray(mergedArray(arr1, arr2));

        sc.close();
    }

    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } 
            else {
                arr3[i] = arr2[i - arr1.length];
            }
        }

        return arr3;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
