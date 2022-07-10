package _7_Assignmnet1;

import java.util.Scanner;

public class _9_reverseint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input > 0) {
            int last = input % 10;
            System.out.print(last);
            input = input / 10;
        }
    }
}
