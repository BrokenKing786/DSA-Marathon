public class Reverse {
    public static void main(String[] args) {
        int n = 65;
        int divisor = 0;
        int rev = 0;

        while (n != 0) {
            divisor = n % 10;
            rev = rev * 10 + divisor;
            n = n / 10;
        }

        System.out.println(rev);
    }
}