package _3_Arrays.Sorting;

public class _4_mergeSort {

    public static void divide(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        conquer(arr, start, mid, end);
    }

    public static void conquer(int[] arr, int start, int mid, int end) {

        int[] merged = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int idx = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[idx] = arr[idx1];
                idx++;
                idx1++;
            } else {
                merged[idx] = arr[idx2];
                idx++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            merged[idx] = arr[idx1];
            idx++;
            idx1++;
        }

        while (idx2 <= end) {
            merged[idx] = arr[idx2];
            idx++;
            idx2++;
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 7, 9 };

        // merge sort
        divide(arr, 0, arr.length - 1);

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
