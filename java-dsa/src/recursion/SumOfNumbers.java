package recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 4;
        int total = sum(n);
        System.out.println(total);

    }

    // space complexity - O(n) -bcuz n stack frames get stored in memory
    // time complexity - O(n)
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);

    }
}
