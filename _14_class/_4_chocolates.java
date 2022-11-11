package _14_class;

public class _4_chocolates {
    private int i;
    private int n;

    _4_chocolates(int i, int n) {
        this.i = i;
        this.n = n;
    }

    public int position() {
        int p = n - i;
        for (int j = 1; j < p; j++) {
            if (i == 7) {
                i = 1;
                continue;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        _4_chocolates obj = new _4_chocolates(3, 10);
        int position = obj.position();
        System.out.println("Position of the child is: " + position);

    }
}
