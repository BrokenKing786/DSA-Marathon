public class Palindrome {
    public static void main(String[] args) {
        int n = 969;
        int original =n;
        int remainder = 0;
        int rev = 0;
        while (n > 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;

        }
        if(original==rev){
            System.out.println("Palindrome");
        }
            else{
                System.out.println("Not a palindrome number");
            }
        }
    }

