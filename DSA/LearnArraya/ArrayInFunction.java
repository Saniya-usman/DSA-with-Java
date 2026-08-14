package LearnArraya;

import java.util.*;

public class ArrayInFunction {
    // public static void main(String[] args) {
    //     int[] num = { 3, 4, 5, 6 };
    //     System.out.println(Arrays.toString(num));
    //     change(num);
    //     System.out.println(Arrays.toString(num));
    // }

    // static void change(int[] arr) {
    //     arr[0] = 99;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
    // int[] numbers = {23, 65, 62, 98, 43, 9, 112};
    // for(int num : arr){
    //     System.out.print(num+" ");
    // }
    System.out.println(Arrays.toString(arr));
    }
   

}
