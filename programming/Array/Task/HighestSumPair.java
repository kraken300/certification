import java.util.Scanner;

public class HighestSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        highestSum(arr);

        sc.close();
    }

    public static void highestSum(int[] arr) {

        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        int second_greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_greatest && arr[i] != greatest) {
                second_greatest = arr[i];
            }
        }

        System.out.println("First number : " + greatest);
        System.out.println("Second number : " + second_greatest);

        System.out.println("Sum : " + (greatest + second_greatest));

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
