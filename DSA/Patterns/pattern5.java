package Patterns;

public class pattern5 {
    static void patternfive(int n){
        for (int i = 1; i <=2* n; i++) {
            int totalColsInRow = i > n ? 2*n - i: i;
            for (int j = 1; j <= totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternfive(5);
    }
}
