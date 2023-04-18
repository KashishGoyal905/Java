package _19_Tries;

public class fibonnaci {
    public static void fib(int n){
        if(n == 1 || n == 2){
            System.out.println(n);
        }else{
            fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
