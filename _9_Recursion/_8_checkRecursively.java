package _9_Recursion;

import java.util.Scanner;

public class _8_checkRecursively {
    public static boolean check(int[] arr, int x) {
        if (arr.length == 0) {
            return false;
        }
        int arr2[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i] = arr[i];
        }
        if(arr[arr.length - 1]==x){
            return true;
        }else{
            return check(arr2, x);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        boolean ans = check(array, x);
        System.out.println(ans);
    }
}
