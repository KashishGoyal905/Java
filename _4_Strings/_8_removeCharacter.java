package _4_Strings;

import java.util.Scanner;

public class _8_removeCharacter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String x = s.nextLine();
        int count = 0;
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(0) == 'a') {
                count++;
            }
        }
        int i = 0;
        while (count > 0) {
            if (i < 0) {
                i = 0;
            }
            if (str1.charAt(i) == 'a') {
                str1 = str1.substring(0, i) + str1.substring(i + 1);
                i--;
                count--;
                System.out.println(str1 + " " + i);
            } else {
                i++;
            }
        }
    }
}
