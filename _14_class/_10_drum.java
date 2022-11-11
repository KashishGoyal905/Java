package _14_class;

public class _10_drum {
    private int drum1;
    private int drum2;

    _10_drum(int drum1, int drum2) {
        this.drum1 = drum1;
        this.drum2 = drum2;
    }

    public int getDrum() {
        int ans = 0;
        for (int i = 1; i <= drum1 && i <= drum2; i++) {
            if (drum1 % i == 0 && drum2 % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _10_drum obj = new _10_drum(36, 72);
        int ans = obj.getDrum();
        System.out.println("the size of the largest container is: " + ans);
    }
}
