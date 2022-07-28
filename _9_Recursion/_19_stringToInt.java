package _9_Recursion;

import java.util.Scanner;

public class _19_stringToInt {
    public static int stringToInt(String m, int start, int end) {
        if (start > end - 1) {
            return 0;
        }
        return Integer.parseInt(m.charAt(start) + "") + stringToInt(m, start + 1, end);
    }
    // todo later

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int start = 0;
        int end = m.length();
        int ans = stringToInt(m, start, end);
        System.out.println(ans);
    }
}
