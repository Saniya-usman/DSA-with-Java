package LearnArraya;

import java.util.Arrays;

public class function {
    // static void Swap(int a, int b){
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println(a + " " + b);
    // }

    static void change(int[] arr) {
        arr[1] = 33;
    }

    public static void main(String[] args) {
        // Swap(10, 20);
        int[] num = { 2, 3, 7, 9, 54, 76, 23 };
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

}
