package _1_Patterns;

import java.util.Scanner;

public class patter6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print(j+1 + " ");
                m=j+1;
            }
            for(int k = 0; k < (n*2)-(2*(i+1)) - 1; k++) {
                System.out.print("  ");
            }
            int l = 0;
            while(l<=i) {
                if(m==n){
                    if(m-l-1==0){
                        return;
                    }
                    System.out.print(m-l-1 + " ");
                    l++;
                }else{
                    System.out.print(m -l + " ");
                    l++;
                }
            }
            System.out.println();
        }
    }
}
