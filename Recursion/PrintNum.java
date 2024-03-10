package Recursion;

import java.util.*;

public class PrintNum {

    static void f(int i, int n) {
        if (i > 1)
            return;

        f(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        f(1, n);

    }

}
