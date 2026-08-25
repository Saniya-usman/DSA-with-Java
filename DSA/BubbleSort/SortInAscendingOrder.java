package BubbleSort;

import java.util.Arrays;

public class SortInAscendingOrder {
    static void SortInAscending(int[] arr){
       

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
       
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SortInAscending(arr);
        System.out.println(Arrays.toString(arr));
    }

}
