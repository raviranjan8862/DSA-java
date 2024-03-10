package Recursion;

import java.util.*;

public class SumN {

    // static void Add(int i, int sum) {
    // if (i < 1) {
    // System.out.print(sum);
    // return;
    // }
    // Add(i - 1, sum + i);
    // }

    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);

    // int n = input.nextInt();
    // Add(n, 0);

    // }

    static int Add(int n) {
        if (n == 0) {
            return 0;
        }

        return n + Add(n - 1);
    }

    public static void main(String[] args) {
        System.out.print(Add(3));
    }
}
