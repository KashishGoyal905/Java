// package _9_Recursion;

// import java.util.Scanner;

// public class _22_mergeSort {
//     public static int[] takeInput() {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int array[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             array[i] = scanner.nextInt();
//         }
//         return array;
//     }

//     public static void mergeSort(int[] array, int start, int end) {
//         if (array.length <= 1) {
//             return;
//         }
//         int mid = (start + end) / 2;
//         mergeSort(array, start, mid);
//         mergeSort(array, mid + 1, end);
//         merge(array);

//     }

//     public static void merge(int[] array) {
        
//     }

//     public static void main(String[] args) {
//         int arr[] = takeInput();
//         int size = arr.length;
//         mergesort(arr, 0, size);
//     }
// }

// todo later



