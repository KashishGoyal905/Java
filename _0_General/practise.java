package _0_General;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
