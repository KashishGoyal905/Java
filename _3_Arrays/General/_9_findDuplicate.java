package _3_Arrays.General;

import java.util.Scanner;

public class _9_findDuplicate {
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
        for (int i = 0; i < size; i++) {
            int duplicate = arr[i];
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[j] == duplicate) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(duplicate);
                return;
            }
        }
    }

}
