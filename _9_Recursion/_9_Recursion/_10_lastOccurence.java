package _9_Recursion;

import java.util.Scanner;

public class _10_lastOccurence {
    public static int lastOccurence(int[] array, int x, int start) {
        if (start <= 0) {
            if (array[start] == x) {
                return start;
            } else {
                return -1;
            }
        }
        if (array[start] == x) {
            return start;
        } else {
            return lastOccurence(array, x, start - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int ans = lastOccurence(array, x, n-1);
        System.out.println(ans);
    }
}
