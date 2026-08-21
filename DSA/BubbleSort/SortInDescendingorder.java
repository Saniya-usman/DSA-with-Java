package BubbleSort;

import java.util.Arrays;

public class SortInDescendingorder {
    static void DescendingOrder(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        } 
        public static void main(String[] args){
            int[] arr = {5, 4, 3, 2, 1};
             DescendingOrder(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

