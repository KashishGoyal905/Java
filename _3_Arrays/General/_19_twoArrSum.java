package _3_Arrays.General;

import java.util.Scanner;

// todo later on ============
public class _19_twoArrSum {
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
        int ans[] = new int[5];
        int carry = 0;
        int counter = 4;
        for (int i = size1 - 1; i > 0; i--) {
            for (int j = size2 - 1; j > 0; j--) {
                int last = arr1[size1 - 1 - i] + arr2[size2 - 1 - j] + carry;
                int answ = last % 10;
                carry = last / 10;
                ans[counter] = answ;
                counter--;
            }
        }
        printArray(ans);
    }
}
