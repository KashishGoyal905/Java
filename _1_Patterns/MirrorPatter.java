package _1_Patterns;

import java.util.Scanner;

public class MirrorPatter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print("<> ");
            }
            for (int j = n - i; j < n; j++) {
                System.out.print(value+" ");
                value++;
            }
            System.out.println(" ");
        }
    }
}
