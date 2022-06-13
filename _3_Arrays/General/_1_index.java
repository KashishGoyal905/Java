package _3_Arrays.General;

import java.util.Scanner;

public class _1_index {
    public static void main(String[] args) {
        // create an arrsy
        boolean arr[] = new boolean[5];
        System.out.println(arr[0]);

        // input
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
