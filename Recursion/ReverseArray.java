package Recursion;

import java.util.*;

public class ReverseArray {
    static void swap(int l, int anArray[], int r) {
        int temp = anArray[l];
        anArray[l] = anArray[r];
        anArray[r] = temp;
    }

    static void Reverse(int l, int anArray[], int r) {
    if (l > r)
    return;
    swap(l, anArray, r);
    Reverse(l + 1, anArray, r - 1);

    }

   

    public static void main(String[] args) {
        int[] anArray = {
                1, 2, 3, 4,
        };
        Reverse(0, anArray, anArray.length-1);
        for (int i = 0; i <= anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
    }

}
