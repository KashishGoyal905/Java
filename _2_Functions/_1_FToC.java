package _2_Functions;

import java.util.Scanner;

public class _1_FToC {
    public static void ftoc(int start, int end, int gap) {
        for (int i = start; i <= end; i = i + gap) {
            int celcius = ((i - 32) * 5) / 9;
            System.out.println(i + " : " + celcius);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int gap = scanner.nextInt();

        ftoc(start, end, gap);

    }
}
