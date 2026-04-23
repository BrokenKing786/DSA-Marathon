public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 6, 67, 98, 101 };
        int target = 10;

        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {

            int middle = (left + right) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return -1;

    }
}
// Time Complexity: O(log n) — Because we cut the
// search space in half every time.
// Space Complexity: O(1) — We only use a few integer variables regardless
// of array size.