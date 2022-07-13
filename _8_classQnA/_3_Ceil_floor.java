package _8_classQnA;

import java.util.Scanner;

public class _3_Ceil_floor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            int ceil = (int) arr[i] + 1;
            int floor = (int) arr[i];
            System.out.println("floor " + floor + " " + "ceil " + ceil + " ");
        }

    }
}
