package _9_Recursion;

import java.util.Scanner;

public class _12_multiplication {
    public static int multiplication(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        return m + multiplication(m, n - 1);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int ans = multiplication(m, n);
        System.out.println(ans);
    }
}
