package _9_Recursion;

import java.util.Scanner;

public class _7_arraySum {

    // public static int sum(int[] arr){
    // if(arr.length==0){
    // return 0;
    // }
    // int arr2[] = new int[arr.length-1];
    // for(int i=0; i<arr.length-1;i++){
    // arr2[i] = arr[i];
    // }
    // return sum(arr2) + arr[arr.length-1];
    // }

    public static int sum(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        return sum(arr, i - 1) + arr[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int ans = sum(array, n - 1);
        System.out.println(ans);

    }
}
