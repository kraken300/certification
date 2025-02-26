import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        System.out.print("Enter an element to insert: ");
        int element = sc.nextInt();

        printArray(insertElementAtIndex2(arr1, index, element));

        sc.close();
    }

    public static int[] insertElementAtIndex1(int[] arr1, int index, int element) {

        int[] arr2 = new int[arr1.length + 1];

        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr1[i];
            } 
            else if (i == index) {
                arr2[i] = element;
            } 
            else {
                arr2[i] = arr1[i - 1];
            }
        }
        return arr2;
    }

    public static int[] insertElementAtIndex2(int[] arr1, int index, int element) {

        int[] arr2 = new int[arr1.length + 1];
        int j = 0;
        
        for (int i = 0; i < arr2.length; i++) {
            if (i == index) {
                arr2[i] = element;
            } 
            else {
                arr2[i] = arr1[j++];
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
