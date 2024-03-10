package Recursion;

import java.util.*;

/**
 * PrintName
 */

public class PrintName {

    static void f(int i, int n) {
        if (i > n)
            return;

        System.out.println("ravi ranjan");
        f(i + 1, n);

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int n = Input.nextInt();
        f(1, n);

    }
}