package recursion;

public class Print {
    public static void main(String[] args) {
        // print 1 to n numbers
        printNumbers(25);

    }

    public static void printNumbers(int n) {

        // base case
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.println(n);

    }
}