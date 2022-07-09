package _2_Functions;

import java.util.Scanner;

public class _2_isFibonacci {
    public static boolean isFibonnaci(int n) {
        int first = 1;
        int second = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = first + second;
            if (c == n) {
                return true;
            }
            first = second;
            second = c;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = isFibonnaci(n);
        System.out.println(result);
    }
}
