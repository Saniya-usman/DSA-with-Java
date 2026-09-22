public class NumfromNtoOne {
    static  int NtoOne(int n){

        if(n == 0){
            return -1;
        }
        System.out.println(n);
        return NtoOne( n - 1);
    }
    public static void main(String[] args) {
        NtoOne(5);
    }
}
