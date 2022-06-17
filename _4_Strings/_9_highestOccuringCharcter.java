package _4_Strings;

import java.util.Scanner;

public class _9_highestOccuringCharcter {
    public static void main(String[] args){
    int arr[] = new int[256];
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    for(int i=0;i<str.length();i++){
        int ascii = (int)str.charAt(i);
        arr[ascii]++;
    }
     int max = 0;
     int finalindex = -1;
     for(int i=0;i<256;i++){
         if(arr[i]>max){
             max = arr[i];
             finalindex = i;

         }
     }
     char ans = (char)finalindex;
     System.out.println(ans);
    }
}
