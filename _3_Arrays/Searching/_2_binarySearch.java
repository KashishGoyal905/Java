package _3_Arrays.Searching;

import java.util.Scanner;

public class _2_binarySearch {
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int size = arr.length;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int start = 0;
        int end = size - 1;
        int result = -1;
        while (start<=end){
            int mid =(start+end)/2;
            if (arr[mid]==x){
                result = mid;
                System.out.println(result);
                return;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(result);
    }
}
