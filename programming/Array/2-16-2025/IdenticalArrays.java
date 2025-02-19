import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array 1 size : ");
        int size1 = sc.nextInt();

        System.out.print("Enter array 2 size : ");
        int size2 = sc.nextInt();

        int[] arr = new int[size1];
        int[] brr = new int[size2];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element (Array 1) : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.print("Enter arr[" + i + "] element (Array 2) : ");
            brr[i] = sc.nextInt();
        }

        boolean result = checkIdenticalArrays(arr, brr);
        System.out.println(result);
        // printArray(arr);

        sc.close();
    }

    public static boolean checkIdenticalArrays(int[] arr, int[] brr) {

        if (arr.length != brr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == brr[i]) {
                continue;
            } 
            else {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}
