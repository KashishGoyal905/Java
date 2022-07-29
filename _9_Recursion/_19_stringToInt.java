package _9_Recursion;

import java.util.Scanner;

public class _19_stringToInt {
    public static int stringToInt(String m, int start, int end) {
        if (start >= m.length()) {
            return 0;
        }
        // System.out.print(m.charAt(end - 1));
        return Character.getNumericValue(m.charAt(end - 1)) + stringToInt(m, start + 1, end - 1) * 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int start = 0;
        int end = m.length();
        int ans = stringToInt(m, start, end);
        System.out.println(ans);
    }
}
