import java.util.Scanner;

public class _14_DecimalToBinary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr;
        arr = new long[50];
        int i = 0;
        while (n > 0) {
            int out = n % 2;
            arr[i] = out;
            i++;
            n = n / 2;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
