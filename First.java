import java.util.Scanner;

public class First {
    private static int a;

    public First(int a) {
        this.a = a;
    }

    public static int cube(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        First ob = new First(a);
        int ans = First.cube(a);
        System.out.println(ans);

    }
}
