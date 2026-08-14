package LearnArraya;

import java.util.Arrays;

public class Swap {
    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {1 , 8, 5, 90, 3, 65, 72, 84,23};
        Swap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}
