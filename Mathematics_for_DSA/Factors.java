package Mathematics_for_DSA;

public class Factors {
    static  void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       factors1(20);
    }
}
