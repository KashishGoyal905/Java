

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basic = scanner.nextInt();
        String s = scanner.next();
        char c = s.charAt(0);
        double hra = (basic * 0.20);
        double da = (basic * 0.50);
        double pf = (basic * 0.11);
        int allow;
        if (c == 65) {
            allow = 1700;
        } else if (c == 66) {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double TotalSalary = basic + hra + da + allow - pf;
        double ans = Math.round(TotalSalary);
        int answer = (int) ans;
        System.out.println(answer);
    }

}
