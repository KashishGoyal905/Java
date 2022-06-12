package _4_Strings;

import java.util.Scanner;

public class _1_countWords {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("wordCount: " + wordCount);
    }
}
