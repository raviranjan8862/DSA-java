package Recursion;

import java.util.*;

public class Factorial {

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.print(fact(n));
    }

}
