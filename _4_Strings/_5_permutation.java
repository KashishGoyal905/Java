package _4_Strings;

import java.util.Scanner;

public class _5_permutation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        boolean count = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count = true;
                    break;
                } else {
                    count = false;
                }
            }
            if (count == false) {
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }
}
