package _3_Arrays.General;

import java.util.Scanner;

public class _6_ArrangeNumbers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        int firstHalf = size / 2;
        int secondHalf = size - firstHalf;
        int a = 1;
        for (int i = 0; i <= firstHalf; i++) {
            array[i] = a;
            a = a + 2;
        }
        int b = 2;
        for (int i = size-1; i >=secondHalf; i--) {
            array[i] = b;
            b = b + 2;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
