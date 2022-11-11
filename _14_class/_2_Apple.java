package _14_class;

public class _2_Apple {

    int num1;
    int num2;

    _2_Apple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int totalPacks() {
        int gcd = 1;
        int lcm = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (num1 * num2) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 8;
        _2_Apple obj = new _2_Apple(num1, num2);
        int lcm = obj.totalPacks();
        int apple = lcm/num1;
        int banana = lcm/num2;
        System.out.println("Apple: " + apple+ " " + "Banana: " + banana);
    }
}
