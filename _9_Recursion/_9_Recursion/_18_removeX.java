package _9_Recursion;

import java.util.Scanner;

public class _18_removeX {
    public static String removeX(String m, int start, int end) {
        if (start > end - 1) {
            return "";
        }
        if (m.charAt(start) == 'x') {
            return removeX(m, start + 1, end);
        } else {
            return m.charAt(start) + removeX(m, start + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int start = 0;
        int end = m.length();
        String ans = removeX(m, start, end);
        System.out.println(ans);
    }
}
