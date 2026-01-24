public class CountDigit {
public static void main(String[] args) {
    int n = 9675434; // count 7 , result should come 7
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);

}
}
