package Sorting;

import java.util.*;

public class Quicksort {
    public static int partion(int arr[], int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i <= high - 1) {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

    public static void quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int partIndex = partion(arr, low, high);
            quick_sort(arr, low, partIndex - 1);
            quick_sort(arr, partIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the size of array: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        quick_sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
