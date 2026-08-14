package BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
                
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
