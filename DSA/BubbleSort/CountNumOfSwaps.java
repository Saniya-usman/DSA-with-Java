package BubbleSort;

import java.util.Arrays;

public class CountNumOfSwaps {
    static int CountSwap(int[] arr){
    int n = arr.length;
    int count = 0;

    for(int i = 0; i< n-1; i++)
    {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
    }
       return count; 
    
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        
        System.out.println(CountSwap(arr));
    }
    
}
