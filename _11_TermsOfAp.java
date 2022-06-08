import java.util.Scanner;

public class _11_TermsOfAp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 1;
        for (int i = 1; i <= n; i++) {
            int output = (3 * z) + 2;
            if (output % 4 != 0) {
                System.out.print(output + " ");
            }
            z++;
        }
    }
}
