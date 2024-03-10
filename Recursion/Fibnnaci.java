package Recursion;

import java.util.*;

public class Fibnnaci {

    static int Checkfib(int n) {
        if (n <= 1)
            return n;

        return Checkfib(n - 1) + Checkfib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print(Checkfib(n));

    }

}
