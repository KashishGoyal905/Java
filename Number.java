import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        // DATA TYPES
        int i = 10; // 4 byte
        int j = 20;
        int sum = i + j;
        short s = 1; // 2 byte
        long l = 12345; // 8 byte
        float f = 1.0f; // 4 byte
        double d = 1.0; // 8 byte
        char c = 'a'; // 2 bytes
        boolean b = true; // 1 bit
        // float k;

        System.out.println("your sum is " + sum);
        // System.out.println(k);

        try (// TAKING INPUTS
                Scanner scan = new Scanner(System.in)) {
            int i1 = scan.nextInt();
            int j1 = scan.nextInt();
            int sum1 = i1 + j1;

            String str = scan.nextLine(); // it takes whole line as a input
            String str2 = scan.next(); // it will stop after space
            long l1 = scan.nextLong();
            double d1 = scan.nextDouble();
            float f2 = scan.nextFloat();
            short s2 = scan.nextShort();
            System.out.println("your sum is " + sum1);
        }

    }
}
