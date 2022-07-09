package _7_Assignmnet1;

import java.util.Scanner;

public class _1_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int checker = input;
        int reverse = 0;
        while (input > 0) {
            int last = input % 10;
            reverse = reverse*10+ last;
            input = input / 10;
        }
        if(reverse == checker) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
