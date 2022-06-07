package Functions;

import java.util.Scanner;

public class _2_isFibonacci {
    public static boolean isFibonnaci(int n) {
        int first = 1;
        int second = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = first + second;
            first = second;
            second = c;
            if (c == n) {
                return true;
            }
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
