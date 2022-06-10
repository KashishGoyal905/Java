package _3_Arrays;

import java.util.Scanner;

public class _17_checkRotation {
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int size = arr.length;
        int ans = 0;
        for (int i = 0; i < size-1; i++) {
            if (arr[i]>arr[i+1]){
                ans = i+1;   
            }
        }
        System.out.println(ans);
    }
}
