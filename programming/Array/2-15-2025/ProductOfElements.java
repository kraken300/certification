import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element : ");
            arr[i] = sc.nextInt();
        }

        int result = productOfElements(arr);
        System.out.println(result);
        // printArray(arr);

        sc.close();
    }

    public static int productOfElements(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        return prod;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}