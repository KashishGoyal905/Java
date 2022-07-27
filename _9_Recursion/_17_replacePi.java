package _9_Recursion;

import java.util.Scanner;

public class _17_replacePi {
    public static void replacePi(String str, int start, int n, String result) {
        if (start >= n - 1) {
            return;
        }
        if (str.charAt(start) == 'p' && str.charAt(start + 1) == 'i') {
            result += "3.14";
            replacePi(str, start + 2, n, result);
        } else {
            result += str.charAt(start);
            replacePi(str, start + 1, n, result);
        }
        System.out.println(result);
        // return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int size = m.length();
        String result = "";
        int start = 0;
        replacePi(m, start, size, result);
        // System.out.println(ans);
    }
}
