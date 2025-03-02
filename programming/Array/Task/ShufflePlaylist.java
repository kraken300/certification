import java.util.Scanner;

public class ShufflePlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to shuffle : ");
        int position = sc.nextInt();

        printArray(shufflePlaylist(arr, position));

        sc.close();
    }

    public static int[] shufflePlaylist(int[] arr, int position) {
        int[] arr2 = new int[arr.length];

        int j = 0;
        for (int i = position; i < arr.length; i++) {
            arr2[j++] = arr[i];
        }

        int k = 0;
        for (int i = arr.length - position + k; i < arr.length; i++) {
            arr2[i] = arr[k++];
        }

        return arr2;
    }

    public static int[] shufflePlaylist2(int[] arr, int position) {

        int[] arr2 = new int[arr.length];

        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < position) {
                arr2[arr.length - position + j] = arr[j++];
            } else {
                arr2[k++] = arr[i];
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
