package _7_Assignmnet1;

import java.util.Scanner;

public class _6_EvenString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i));
            }
        }
    }
}
