package _3_Arrays.Sorting;

public class _5_quickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pidx = partition(arr, low, high);

        quickSort(arr, low, pidx - 1);
        quickSort(arr, pidx + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 2, 45, 63, 22, 44, 1, 56 };

        // quick sort
        quickSort(arr, 0, arr.length - 1);

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
