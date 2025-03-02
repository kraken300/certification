import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        printArray(shufflePlaylist(arr, 3));

        sc.close();
    }

    public static int[] shufflePlaylist(int[] arr, int position) {

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

    public static int[] shufflePlaylist2(int[] arr, int position) {
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

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
