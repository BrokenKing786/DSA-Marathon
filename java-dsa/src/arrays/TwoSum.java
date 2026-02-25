package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        // using hashmap - Time complexity 0(n)
        // Space Complexity 0(n) as input increases the hashmap increase suppoe the
        // required numbers are in last
        // so we will add al numbers with their index position

        // NOTE - complement means the number req to make the target

        int arr[] = { 5, 8, 1, 3, 7, 10 };
        int target = 15;

        System.out.println(Arrays.toString(findSum(arr, target)));

    }

    public static int[] findSum(int arr[], int target) {

        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (valueToIndex.containsKey(complement)) {
                return new int[] { valueToIndex.get(complement), i };

            }
            valueToIndex.put(arr[i], i);

        }
        return new int[] { -1, -1 };

    }

}
