import java.util.Scanner;

public class TallestPlayerHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element : ");
            arr[i] = sc.nextInt();
        }

        int result = tallestPlayerHeight(arr);
        System.out.println(result);
        // printArray(arr);

        sc.close();
    }

    public static int tallestPlayerHeight(int[] arr) {
        int maxHeight = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
        }
        return maxHeight;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}
