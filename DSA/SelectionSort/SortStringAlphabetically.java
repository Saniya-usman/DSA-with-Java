package SelectionSort;

import java.util.Arrays;

public class SortStringAlphabetically {
    static void SSIAO(String[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Manngo", "Apple", "Banana", "Sanu"} ;
        SSIAO(arr);
        System.out.println(Arrays.toString(arr));
    }
}

