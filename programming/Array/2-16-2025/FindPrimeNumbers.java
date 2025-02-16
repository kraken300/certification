import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element : ");
            arr[i] = sc.nextInt();
        }

        findPrimeNumbers(arr);
        // printArray(arr);

        sc.close();
    }

    public static void findPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(arr[i] + "    ");
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}