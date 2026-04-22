public class LinearSearch {
    public static void main(String[] args) {
        int findElement = 2;
        int[] arr = { 1, 3, 5, 7, 8, 9, 2 };
        System.out.println(linearSearch(arr, findElement));

    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }

        }

        return -1;

    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)