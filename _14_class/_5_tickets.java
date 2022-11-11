package _14_class;

public class _5_tickets {
    private int position;
    private int n;

    _5_tickets(int position, int n) {
        this.position = position;
        this.n = n;
    }

    public int position() {
        for (int j = 1; j < n; j++) {
            if (position == 200) {
                position = 1;
                continue;
            }
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        _5_tickets obj = new _5_tickets(21, 50);
        int position = obj.position();
        System.out.println("Position of the student is: " + position);

    }
}
