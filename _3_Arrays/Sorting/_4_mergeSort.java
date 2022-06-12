package _3_Arrays.Sorting;

import java.util.Scanner;

public class _4_mergeSort {
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
        int arr1[] = takeInput();
        int size1 = arr1.length;
        int arr2[] = takeInput();
        int size2 = arr2.length;
        int ans[] = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int third = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                ans[third] = arr1[i];
                third++;
                i++;
            } else {
                ans[third] = arr2[j];
                third++;
                j++;
            }
        }
        while (i < size1) {
            ans[third] = arr1[i];
            i++;
            third++;
        }
        while (j < size2) {
            ans[third] = arr2[j];
            j++;
            third++;
        }
        printArray(ans);
    }
}
