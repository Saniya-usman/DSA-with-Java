public class CountNumofDigits {
    static int Count(int n){
        if (n == 0) {
            return 0;
        }
       
       return 1+Count(n/10);
    }
    public static void main(String[] args) {
        int n = Count(1234567);
        System.out.println(n);
    }
} 