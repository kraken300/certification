import java.util.Scanner;

public class BookCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter 0 for science fiction, 1 for mystery");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter book : ");
            arr[i] = sc.nextInt();
        }

        int result = numberOfFictionBooks(arr);
        System.out.println("Number of science fiction books: " + result);

        sc.close();
    }

    public static int numberOfFictionBooks(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}
