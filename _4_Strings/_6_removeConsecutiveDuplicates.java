package _4_Strings;

import java.util.Scanner;

public class _6_removeConsecutiveDuplicates {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length()-1; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    str1 = str1.substring(0, j) + str1.substring(j + 1);
                }
            }
        }
        System.out.println(str1);
    }
}
