package _19_Tries;

public class recursion {
    public static void solve(int[] arr, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(arr[index] + " ");
        solve(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        solve(arr, arr.length -1);
    }
}
