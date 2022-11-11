package _14_class;

import java.util.Scanner;

public class _8_linear2 {
    private int arr[];
    private int size;
    private int value;

    _8_linear2(int size, int value) {
        this.value = value;
        this.size = size;
        arr = new int[size];
    }

    public boolean isPresent(int arr[]) {
        for (int i = 0; i < size; i++) {
            if (arr[i] <=value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _8_linear2 obj = new _8_linear2(5, 4);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        boolean answer = obj.isPresent(arr);
        System.out.println(answer);

    }
}
