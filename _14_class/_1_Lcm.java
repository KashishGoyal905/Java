package _14_class;

import java.util.Scanner;

public class _1_Lcm {
    private int num1;
    private int num2;

    _1_Lcm(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int lcm() {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int num2 = scanner.nextInt();
        _1_Lcm obj = new _1_Lcm(num1, num2);
        int ans = obj.lcm();
        System.out.println("The lcm is:" + ans);
    }
}
