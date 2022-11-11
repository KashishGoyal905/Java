package _14_class;

public class _6_server {
    private int position;
    private int n;

    _6_server(int position, int n) {
        this.position = position;
        this.n = n;
    }

    public int position() {
        for (int j = 1; j < n; j++) {
            if (position == 10) {
                position = 1;
                continue;
            }
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        _6_server obj = new _6_server(5, 21);
        int position = obj.position();
        System.out.println("Position of the machine is: " + position);

    }
}
