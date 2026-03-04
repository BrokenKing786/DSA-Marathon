package recursion;

public class factorial {
    public static void main(String[] args) {

        System.out.println(fact(4));

    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
    // Space Complexity - O(n)
    // Time Complexity - O(n)
}
