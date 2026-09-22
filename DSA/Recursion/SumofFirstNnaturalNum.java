public class SumofFirstNnaturalNum {
    
    static int Sum(int n){

        if (n == 1) {
            return 1;
        }
        return n + Sum(n-1);
    }
    public static void main(String[] args) {
        int sum = Sum(5);
        System.out.println(sum);
    }
}
