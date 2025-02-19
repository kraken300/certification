import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter an element : ");
        int element = sc.nextInt();

        int result = frequencyOfSpecifiedElement(arr, element);
        System.out.println("Element " + element + " has appeared " + result + " time/s");
        // printArray(arr);

        sc.close();
    }

    public static int frequencyOfSpecifiedElement(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }
        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }
}