package _14_class;

public class _3_cathy {
    private int cupcakes;
    private int chocolate;

    public _3_cathy(int cupcakes, int chocolate) {
        this.cupcakes = cupcakes;
        this.chocolate = chocolate;
    }

    int getLCM() {
        int gcd = 0, lcm = 1;
        System.out.println("Common Multiples of " + cupcakes + " and " + chocolate + ": ");
        for (int i = 1; i < cupcakes && i <= chocolate; i++) {
            if (cupcakes % i == 0 && chocolate % i == 0) {
                gcd = i;
            }
            lcm = (cupcakes * chocolate) / gcd;
        }
        return lcm;
    }

    public static void main(String[] args) {
        int cupcakes = 12, chocolate = 20;
        _3_cathy obj = new _3_cathy(cupcakes, chocolate);
        int lcm = obj.getLCM();
        int cups = lcm / cupcakes;
        int chocolates = lcm / chocolate;
        System.out.println("chocolate: " + cups + " " + " cupcakes: " + chocolates);
    }
}
