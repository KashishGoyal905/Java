package _0_General;
import java.util.Scanner;
import java.lang.Math;

public class _13_BinaryToDecimal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0.0;
        int power = 0;
        while (n > 0) {
            int last = n % 10;
            result = result + (last * Math.pow(2, power));
            n = n / 10;
            power++;
        }
        int answer = (int)result;
        System.out.println(answer);
    }
}
