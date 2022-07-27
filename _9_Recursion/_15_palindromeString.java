package _9_Recursion;

import java.util.Scanner;

public class _15_palindromeString {
    public static boolean isPalindrome(String s, int m, int n) {
        if (m >= n) {
            return true;
        }
        if (s.charAt(m) == s.charAt(n - 1)) {
            return isPalindrome(s, m + 1, n - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int start = 0;
        int end = m.length();
        boolean ans = isPalindrome(m, start, end);
        System.out.println(ans);
    }
}
