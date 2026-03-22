package recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Power of two " + powerOfTwo(n));

    }

    public static boolean powerOfTwo(int number) {
        if (number == 1) {
            return true;

        }
        if (number % 2 != 0 || number < 1) {

            return false;
        }

        return powerOfTwo(number / 2);
    }
}
