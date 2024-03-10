package Sorting;

import java.util.*;

public class Insertion {
    static void Insertion_sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the " + n + " element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Insertion_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
