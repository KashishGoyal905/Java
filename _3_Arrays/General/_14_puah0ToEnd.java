package _3_Arrays.General;

import java.util.Scanner;

public class _14_puah0ToEnd {
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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("count is" + count);
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        int z = size - 1;
        while (count > 0) {
            arr[z] = 0;
            z--;
            count--;
        }
        printArray(arr);
    }
}
