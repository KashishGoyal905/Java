package _9_Recursion;

import java.util.Scanner;
import java.lang.Math;

public class _14_geometricSum {
    public static double sum(int n){
        if(n<=0){
            return 1;
        }
        return 1/Math.pow(2,n) + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double ans = sum(m);
        System.out.println(ans);
    }
}
