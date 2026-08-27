package SelectionSort;

import java.util.Arrays;

public class SelectionSortInDescendingOrder {
    static void SIDO(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        SIDO(arr);
        System.out.println(Arrays.toString(arr));
    }
}
