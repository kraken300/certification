import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter an element to delete: ");
        int element = sc.nextInt();

        printArray(deleteElementAtIndex(arr1, element));

        sc.close();
    }

    public static int[] deleteElementAtIndex(int[] arr1, int element) {

        int[] arr2 = new int[arr1.length - 1];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == element) {
                continue;
            } 
            else {
                arr2[j++] = arr1[i];
            }
        }
        return arr2;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
