public class Checkpalindrome {
    
    static int reverse = 0;
    static void palindrome(int n){
        if (n == 0) {
            return ;
        }
        reverse = reverse * 10 + n % 10;
        palindrome(n/10);
        
    }
    public static void main(String[] args) {
        int n = 123;
        palindrome(n);
         if (n == reverse) {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
