package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
// Time Complexity: O(2ⁿ)
// Space Complexity: O(n)