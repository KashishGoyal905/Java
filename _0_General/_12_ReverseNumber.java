package _0_General;
import java.util.Scanner;

public class _12_ReverseNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.print("0");
        }
        while (n % 10 == 0) {
            n = n / 10;
        }long rev = 0;
        while (n > 0) {
            int last = n % 10;
            // System.out.print(last);
            rev = rev*10 + last;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
