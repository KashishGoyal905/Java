package _7_Assignmnet1;

public class _8_commonElements {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int arr2[] = { 1, 2, 9, 4, 5, 6 };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }

        }
    }
}
