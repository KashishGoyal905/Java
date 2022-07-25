package _9_Recursion;

import java.util.Scanner;

public class _2_sumOfNaturals {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
}
