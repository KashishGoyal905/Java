package Patterns;

import java.util.Scanner;

public class CharPattern2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char c = (char) ('A' + n - i);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (c));
                c = (char) (c + 1);
            }
            System.out.println(" ");
        }
    }

}
