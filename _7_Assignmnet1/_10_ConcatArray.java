package _7_Assignmnet1;

public class _10_ConcatArray {
    public static void main(String[] args) {
        String arr1[] = { "Hello", "World" };
        String arr2[] = { "Hi", "There" };
        String arr3[] = new String[arr1.length * arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[k] = arr1[i] + " " + arr2[j];
                k++;
            }
        }
        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l] + ", ");
        }
    }
}
