package _7_Assignmnet1;

import java.util.Scanner;

public class _5_absentDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        int ans[] = new int[10];
        while (input > 0) {
            long last = input % 10;
            ans[(int) last]++;
            input = input / 10;
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
