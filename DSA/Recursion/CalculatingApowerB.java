public class CalculatingApowerB {
    
    static int Power(int n,int m){

        if (m == 0) {
            return 1;
        }
        return n * Power(n, m-1) ;
    }
    public static void main(String[] args) {
        int p = Power(2, 5);
        System.out.println(p);
    }
}
