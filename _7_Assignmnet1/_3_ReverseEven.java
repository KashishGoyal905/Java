package _7_Assignmnet1;

import java.util.Scanner;

public class _3_ReverseEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        for (int i = input; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
