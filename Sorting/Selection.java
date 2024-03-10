package Sorting;

import java.util.*;

public class Selection {

    public static void Selection_sort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
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
        Selection_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

}
