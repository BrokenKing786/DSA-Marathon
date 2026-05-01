package arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 9, 6, 18, 13 };
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            j = j + 1;
            arr[j] = key;

        }

        System.out.println(Arrays.toString(arr));
    }
    
}
// Time complexity - O(n2)
// Space Complexity - O(1)