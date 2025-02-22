import java.util.Scanner;

public class MissingNumberInUnsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int result = missingNumberInUnsorted2(arr);
        System.out.println(result);

        sc.close();
    }

    public static int missingNumberInUnsorted1(int[] arr) {
        if (arr.length == 1) {
            return -1;
        }

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++, smallest++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (smallest == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                continue;
            } else {
                return smallest;
            }
        }
        return -1;
    }

    public static int missingNumberInUnsorted2(int[] arr) {
        if (arr.length == 1) {
            return -1;
        }

        int smallest = arr[0];
        int greatest = arr[0];
        int arr_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > greatest) {
                greatest = arr[i];
            }

            arr_sum = arr_sum + arr[i];
        }

        int greatest_sum = greatest * (greatest + 1) / 2;
        int smallest_sum = (smallest - 1) * (smallest) / 2;
        int calculated_sum = greatest_sum - smallest_sum;

        if (calculated_sum == arr_sum) {
            return -1;
        } 
        else {
            return calculated_sum - arr_sum;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
