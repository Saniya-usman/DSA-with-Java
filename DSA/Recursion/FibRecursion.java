

public class FibRecursion {
    
    static int fibo(int n){
        if (n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int fibFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/ Math.sqrt(5));
    }
    public static void main(String[] args) {
        // System.out.println(fibo(50));
        System.out.println(fibFormula(55));
    }
}
