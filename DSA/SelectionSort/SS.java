package SelectionSort;

import java.util.Arrays;

public class SS {
    static void SelectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
