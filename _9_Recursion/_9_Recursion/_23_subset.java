package _9_Recursion;

public class _23_subset {
    public static void subset(int arr[], int limit, int i, int j) {
        if (limit == 0) {
            return;
        }
        if (i == j) {
            return;
        } else {
            System.out.print(arr[i] + arr[j] + " ");
        }
        subset(arr, limit - 1, i, j + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int limit = (int) Math.pow(2, 3);
        int i = 0;
        int j = 0;
        subset(arr, limit, i, j);
    }
}
