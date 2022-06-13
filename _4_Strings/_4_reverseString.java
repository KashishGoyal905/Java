package _4_Strings;

import java.util.Scanner;

public class _4_reverseString {

    public static String reverseWords(String str) {

        String words[] = str.split("\\s");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                result = words[i] + result;
            } else {
                result = ' ' + words[i] + result;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWords(str));

    }
}
