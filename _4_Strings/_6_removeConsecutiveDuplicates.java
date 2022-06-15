package _4_Strings;

import java.util.Scanner;

public class _6_removeConsecutiveDuplicates {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        if (str1.length() == 1 || str1.length() == 0) {
            System.out.println(str1);
            return;
        }
        int i = 0;
        while (i >= 0) {
            i = 0;
            if (str1.charAt(0) == str1.charAt(i + 1)) {
                str1 = str1.substring(0, i + 1) + str1.substring(i + 2);
            }
            i = str1.length() - 1;
        }
        if (str1.length() == 1) {
            System.out.println(str1);
            return;
        }
        str1 = str1.substring(0, str1.length() - 1);
        System.out.println(str1);
    }
}
