public class ReverseNumber {
    static int reverse = 0;
    static void Reverse(int n){
        if (n == 0) {
            return ;
        }
        
        reverse = reverse * 10 + n%10;
        Reverse(n/10);

    }
    public static void main(String[] args) {
         Reverse(12345);
         System.out.println(reverse);
    }
}
