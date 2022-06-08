
import java.util.Scanner;

public class _5_powerToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int power = scanner.nextInt();

        if (n == 0 && power == 0) {
            System.out.println("1");
            return;
        }

        int answer = 1;
        for (int i = 1; i <= power; i++) {
            answer = answer * n;
        }
        System.out.println(answer);
    }
}