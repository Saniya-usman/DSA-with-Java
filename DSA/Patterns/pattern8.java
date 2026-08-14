package Patterns;

public class pattern8 {
    static void patterneight(int n){
        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
           for (int j = 0; j <= n; j++) {
             int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
            System.out.print(atEveryIndex+ " ");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        patterneight(4);
    }
}
