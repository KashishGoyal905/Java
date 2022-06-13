package _4_Strings;

import java.util.Scanner;

public class _2_stringPalindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                continue;
            } else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");
    }
}
