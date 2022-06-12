package _0_General;
import java.util.Scanner;

public class _7_NthFibonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 1;
        int second = 1;
        int output = 0;
        for (int i = 0; i < n-2; i++) {
            output = first + second;
            first = second;
            second = output;
        }
        System.out.println(output);

    }
}
