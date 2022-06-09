package _3_Arrays;

import java.util.Scanner;

public class _11_PairSum {
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
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                // if(i==j) continue;
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
