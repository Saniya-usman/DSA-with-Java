package LearnArraya;

import java.util.Arrays;

public class A {
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        fun(2, 4, 5, 8, 6,98, 5, 3, 2, 9, 6);
    }
}
