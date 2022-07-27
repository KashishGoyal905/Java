package _9_Recursion;

import java.util.Scanner;

public class _13_countZeroes {
    int count = 0;
    public static int counter(int m){
        if(m<=0){
            return 0;
        }
        if(m%10==0){
            return counter(m/10) + 1;
        }else{
            return counter(m/10);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int ans = counter(m);
        System.out.println(ans);
    }
}
