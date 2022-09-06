package _9_Recursion;

import java.util.Scanner;

public class _9_firstOccurence {
    public static int firstOccurence(int[] array, int x, int start) {
        if (start >= array.length - 1) {
            if (array[start] == x) {
                return start;
            } else {
                return -1;
            }
        }
        if (array[start] == x) {
            return start;
        } else {
            return firstOccurence(array, x, start + 1);
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
        int ans = firstOccurence(array, x, 0);
        System.out.println(ans);
    }
}
