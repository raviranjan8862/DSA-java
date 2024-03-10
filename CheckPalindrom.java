package Recursion;

import java.util.*;

public class CheckPalindrom {

    static boolean check(int i, String s, int n) {

        if (i >= n / 2)
            return true;
        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        return check(i + 1, s, n);

    }

    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        System.out.println(check(0, s, n));

    }

}
