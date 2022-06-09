package _1_Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int k = i+1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");

        }
    }
}
