package _4_Strings;

import java.util.Scanner;

public class _8_removeCharacter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String x = s.nextLine();
        int count = 0;
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(j) == x.charAt(0)) {
                count++;
            }
        }
        int i = 0;
        int z = str1.length();
        while (count > 0 && z >= 0) {
            if (str1.charAt(i) == x.charAt(0)) {
                str1 = str1.substring(0, i) + str1.substring(i + 1);
                z--;
                count--;
            } else {
                i++;
                z--;
            }
        }
        System.out.println(str1);
    }
}
