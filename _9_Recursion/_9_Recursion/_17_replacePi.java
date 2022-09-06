package _9_Recursion;

import java.util.Scanner;

public class _17_replacePi {
    public static String replacePi(String m, int start, int n) {
        if (start >= n - 1) {
            if (start >= n) {
                return "";
            } else {
                return m.charAt(start) + "";
            }
        }
        if (m.charAt(start) == 'p' && m.charAt(start + 1) == 'i') {
            return "3.14" + replacePi(m, start + 2, n);
        } else {
            return m.charAt(start) + replacePi(m, start + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int end = m.length();
        int start = 0;
        String ans = replacePi(m, start, end);
        System.out.println(ans);
    }
}
