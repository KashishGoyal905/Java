
import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        int z = n;
        while (z > 0) {
            int last = z % 10;
            if (last % 2 == 0) {
                evenSum = evenSum + last;
            } else {
                oddSum = oddSum + last;
            }
            z = z / 10;
        }

        System.out.print(evenSum+ " ");
        System.out.print(oddSum);
    }
}