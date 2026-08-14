package LearnArraya;

import java.util.Arrays;

public class Reverse {
    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            Swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 34, 9, 17};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
