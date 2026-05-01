package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 23, 31 };
        int arr2[] = { 9, 15, 27 };
        int sortedarr[] = merge(arr1, arr2);
        
        System.out.println(Arrays.toString(sortedarr));
    }

    public static int[] merge(int arr1[], int arr2[]) {
        int i = 0; 
        int j = 0; 
        int k = 0; 
        int result[] = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i = i + 1;
            } else {
                result[k] = arr2[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j = j + 1;
            k = k + 1;
        }

        return result;
    }
}