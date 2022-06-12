package _0_General;
import java.util.Scanner;

public class _9_SumOrProduct {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int choice = scanner.nextInt();

        if (choice == 1) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else if (choice == 2) {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            System.out.println(product);
        } else {
            System.out.println("-1");
        }
    }
}
