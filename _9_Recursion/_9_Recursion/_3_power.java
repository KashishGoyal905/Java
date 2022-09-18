package _9_Recursion;

import java.util.Scanner;

public class _3_power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return pow(x, n - 1) * x;
    }

        

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int power = pow(x, n);
        System.out.println(power);
    }
}
