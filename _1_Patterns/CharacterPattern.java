package _1_Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char c = (char)('A' + i);
            for (int j = 0; j < n; j++) {
                System.out.print((char) (c));
                c= (char)(c+1);
            }
            System.out.println(" ");
        }
    }
}
