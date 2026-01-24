// 1
// 22
// 333
// 4444
// 55555

class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
    
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Moves to the next line after the inner loop finishes
            System.out.println(); 
        }
    }
}