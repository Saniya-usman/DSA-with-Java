package BubbleSort;

import java.util.Arrays;

public class AlphabeticStrings {
    static void Comparestrings(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Orange", "Sanu", "Mango"};
        Comparestrings(arr);
        System.out.println(Arrays.toString(arr));
    }
}
