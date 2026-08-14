package Patterns;

public class pattern1 {
    static void patternone(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
             System.out.println( );
        }
       
    }
    public static void main(String[] args) {
        patternone(4);
    }
}
