package Patterns;

public class pattern2 {
    static void patterntwo(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        patterntwo(5);
    }
}
