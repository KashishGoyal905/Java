package _7_Assignmnet1;

import java.util.Scanner;

public class _7_characterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = (int) c;
        int size = ascii - 64;
        char arr[] = new char[size];
        for (int i = 0; i <size; i++) {
            arr[i] = (char) ('A' + (char)i);
        }
       for(int i = 0; i < size; i++) {
        System.out.print(arr[i]+ " ");
       }
        
    }
}
