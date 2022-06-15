package _4_Strings;

import java.util.Scanner;

public class _7_reverseEachWord {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] words = str.split(" ");
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            String str1 = words[i];
            if (i == words.length - 1) {
                for (int j = str1.length() - 1; j >= 0; j--) {
                    ans = ans + str1.charAt(j);
                }
                System.out.println(ans);
                return;
            }
            for (int j = str1.length() - 1; j >= 0; j--) {
                ans = ans + str1.charAt(j);
            }
            ans = ans + "-";
        }
        System.out.println(ans);
    }
}
