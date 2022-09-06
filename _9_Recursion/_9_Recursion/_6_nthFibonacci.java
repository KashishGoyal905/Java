package _9_Recursion;

import java.util.Scanner;

public class _6_nthFibonacci {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}
