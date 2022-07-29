package _9_Recursion;

import java.util.Scanner;

public class _21_TOH {
    public static void TowerOfHanoi(int m, int a, int b, int c) {
        if (m ==0 ) {
            // System.out.println("Move " + a + " to " + b + " using " + c);
            return;
        }
        TowerOfHanoi(m - 1, a, c, b);
        System.out.println(" Move " + m + " to " + b);
        TowerOfHanoi(m - 1, c, b, a);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        TowerOfHanoi(m, a, b, c);
    }
}
