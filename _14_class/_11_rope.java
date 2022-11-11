package _14_class;

public class _11_rope {
    private int rope1;
    private int rope2;

    _11_rope(int rope1, int rope2) {
        this.rope1 = rope1;
        this.rope2 = rope2;
    }

    public int getDrum() {
        int ans = 0;
        for (int i = 1; i <= rope1 && i <= rope2; i++) {
            if (rope1 % i == 0 && rope2 % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _11_rope obj = new _11_rope(16, 24);
        int ans = obj.getDrum();
        System.out.println("the size of the largest rope is: " + ans);
    }
}
