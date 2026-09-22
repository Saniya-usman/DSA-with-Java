public class FactorialofN {
    static int Fact(int n){

        if (n==0) {
            return 1;
        }
        return n*Fact(n-1);
    } 
    public static void main(String[] args) {
        int fac = Fact(5);
        System.out.println(fac);
    }
}
