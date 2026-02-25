package arrays;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 99, 12, 3 };
        int lowest = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            } else {
                int currentDiff = arr[i] - lowest;
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                }

            }
        }
        System.out.println(maxDiff);
    }

}
