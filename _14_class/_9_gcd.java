package _14_class;

public class _9_gcd {
    private int product;
    private int lcm;

    _9_gcd(int product, int lcm) {
        this.product = product;
        this.lcm = lcm;
    }

    public int hcf() {
        int hcf = product / lcm;
        return hcf;
    }

    public static void main(String[] args) {
        _9_gcd object = new _9_gcd(3750, 150);
        int ans = object.hcf();
        System.out.println("Hcf is: " + ans);
    }
}
