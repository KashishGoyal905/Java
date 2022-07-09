public class prime {

    public static boolean isPrime(int prime) {
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 31;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }
}
