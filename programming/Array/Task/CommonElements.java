import java.util.Scanner;

public class CommonElements {
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

        printCommonElements(arr1, arr2);

        sc.close();
    }

    public static void printCommonElements(int[] arr1, int[] arr2) {
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
