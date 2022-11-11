package _14_class;

import java.util.Scanner;

public class _7_linear {
    private int arr[];
    private int size;
    private int value;

    _7_linear(int size, int value) {
        this.value = value;
        this.size = size;
        arr = new int[size];
    }

    public boolean isPresent(int arr[]) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _7_linear obj = new _7_linear(5, 5);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        boolean answer = obj.isPresent(arr);
        System.out.println(answer);

    }
}
