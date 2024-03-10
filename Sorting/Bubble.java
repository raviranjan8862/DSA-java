package Sorting;

import java.util.*;

public class Bubble {
/*
 *  static void Bubble_sort(int arr[], int n) {
    for (int i = n - 1; i >= 1; i--) {
    for (int j = 0; j <= i - 1; j++) {
    if (arr[j] > arr[j + 1]) {
    int temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
    }
    }
    }
    }
 * 
 */
   
    static void Bubble_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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
        Bubble_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
