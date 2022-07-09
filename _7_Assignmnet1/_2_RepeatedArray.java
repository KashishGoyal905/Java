package _7_Assignmnet1;

import java.util.Arrays;
import java.util.Scanner;

public class _2_RepeatedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < arraySize; i++) {
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int i = 0;
        int j = 0;
        while (i < arraySize-1) {
            int freq = 1;
            while (arr[i] == arr[i + 1]) {
                freq++;
                i++;
            }
            if (freq > 1) {
                System.out.println(arr[i] + " " + freq);
            } else {
                i++;
            }
        }
    }
}
