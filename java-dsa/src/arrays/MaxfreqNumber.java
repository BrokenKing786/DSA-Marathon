package arrays;


public class MaxfreqNumber {
    public static void main(String[] args) {

        int arr[]={1,3,5,6,8,1,1,1,4,7,10,10,10,10};
       // Hashing technique: Find the number with the maximum frequency and its occurrence count.

        int maxVal=arr[0];
        for(int i:arr){
            if(i>maxVal){
                maxVal=i;
            }
        }

        int[] freq=new int[maxVal+1];

        int maxCount=0;
        int number=0;

        for(int i:arr){
            freq[i]++;

            if(freq[i]>maxCount){
                maxCount=freq[i];
                number=i;
            }

            else if(freq[i]==maxCount){
                if(i<number){
                    number=i;
                }

            }

        }
        System.out.println("number is "+number+" and frequency is "+maxCount);

        
    }
}
/*
 * Complexity Analysis:
 * --------------------
 * Time Complexity: O(N)
 * - Finding maxVal: O(N) (iterating once to find the maximum).
 * - Counting frequencies: O(N) (iterating once to populate the freq array).
 * - Total: O(N + N) = O(N), where N is the number of elements in the input array.
 * 
 * Space Complexity: O(M)
 * - We create a frequency array of size (maxVal + 1).
 * - Therefore, the space complexity is O(M), where M is the maximum value 
 *   found in the input array.
 */