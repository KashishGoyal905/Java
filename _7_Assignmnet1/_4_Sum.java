package _7_Assignmnet1;

import java.util.Scanner;

public class _4_Sum {
    public static void main(String[] args) {
        int n = 5;
        int d = 3;
        int k = d;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // System.out.print(d + " ");
            sum += d;
            d = (d * 10) + k;

        }
        System.out.println(sum);
    }
}
