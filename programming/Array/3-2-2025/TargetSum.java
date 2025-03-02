// Given an array of positive integers and a target sum, WAP to find the elements whose summation is equal to the target.
// After finding the element pair, the method must return it's indexes.
// If no such elements were found then we must return -1,1;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a target element : ");
        int target = sc.nextInt();

        printArray(targetSum(arr, target));

        sc.close();
    }

    public static int[] targetSum(int[] arr, int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }
}