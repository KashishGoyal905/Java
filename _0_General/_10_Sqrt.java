package _0_General;

import java.util.Scanner;
import java.lang.Math;

public class _10_Sqrt {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double root = Math.sqrt(n);
        int answer = (int) root;
        System.out.println(answer);
    }
}
