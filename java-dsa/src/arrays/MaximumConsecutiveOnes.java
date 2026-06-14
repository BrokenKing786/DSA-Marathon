package arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0 ,0,1,1,1,1,1,1,1,1,1};
        int count = 0;
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (i == arr.length-1 && count > max) {
                    max = count;
                }
            } else {
                if (count > max) {

                    max = count;
                }

                count = 0;

            }

        }
        System.out.println(max);

    }

}
