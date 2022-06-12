package _3_Arrays.General;

import java.util.Scanner;

public class _15_arrayRotate {
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
        int ans[] = new int[size];
        Scanner scanner = new Scanner(System.in);
        int rotate = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == rotate) {
                index = i;
            }
        }
        int k = 0;
        for (int i = index + 1; i < size; i++) {
            ans[k] = arr[i];
            k++;
        }
        for (int i = 0; i <= index; i++) {
            ans[k] = arr[i];
            k++;
        }
        printArray(ans);
    }
}
