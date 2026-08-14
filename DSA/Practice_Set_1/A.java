package Practice_Set_1;

import java.util.Arrays;

public class A {
    //QUESTION 1
    // public static void main(String[] args) {
    //     int[] arr = {34, 65, 87, 35, 98, 23, 53};
    //     System.out.println(Arrays.toString(arr));
    // }

    //QUESTION 2
    // public static void main(String[] args) {
    //     int[] arr = {1, 8, 4, 5, 6,9};
    //     int sum = 0;
    //     for (int i : arr) {
    //         sum = sum + i;
    //     }
    //     System.out.println("The sum of all elements is:"+sum);
    // }

    //QUESTION 3
    // public static void main(String[] args) {
    //     int[] arr = {2, 8, 5, 14, 77, 4, 3};
    //     int mavEle = arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > mavEle) {
    //             mavEle = arr[i];
    //         }
    //     } 
    //     System.out.println("The Maximun value is:"+mavEle);
    // }

    //QUESTION 4
    // public static void main(String[] args) {
    //     int[] arr = {2, 6, 8, 4, 9, 1, 3};
    //     int minEle = arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] < minEle){
    //             minEle = arr[i];
    //         }
    //     }
    //     System.out.println("The minimum value is:"+ minEle);
    // }

    //QUESTION 5
    // public static void main(String[] args) {
    //     int[] arr = { 23, 76, 54, 12, 56, 24};
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]%2==0) {
    //             System.out.println("The even numbers in array are:"+ arr[i] );
    //         }else{
    //             System.out.println("Yhe Odd numbers in array are:" + arr[i]);
    //         }
    //     }
    // }


    //QUESTION 6
    // public static void main(String[] args) {
    //     int[] arr = {2, 5, 7, 3, 9, 1, 8,4};
    //     int num = 9;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == num) {
    //             System.out.println("number found at index:"+ i);
    //         }
    //         // else{
    //         //     System.out.println("Number not found");
    //         // }
    //     }
    // }
    
    
    //QUESTION 7
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     for (int i = arr.length-1; i >=0 ; i--) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    //

    //QUESTION 8
//    public static void main(String[] args) {
//     int[] arr1 = {2, 5, 7, 9, 3, 4, 8};
//     int[] arr2 =new int[arr1.length];
//     for (int i = 0; i < arr1.length; i++) {
//         arr2[i] = arr1[i];
//     }
//     System.out.println(Arrays.toString(arr1));
//     System.out.println(Arrays.toString(arr2));
//    } 


//INTERMEDIATE LEVEL QUESTIONS

//QUESTION 9
    // public static void main(String[] args) {
    //     int[] arr = {2, 8, 7, 5, 9, 24, 5};
    //     int largest = Integer.MIN_VALUE;
    //     int secLarg = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > largest) {
    //             secLarg = largest;
    //             largest = arr[i];
    //         }else if (arr[i] > secLarg && arr[i] != largest) {
    //             secLarg = arr[i];
    //         }
    //     }
        
    //     System.out.println("Second Largrst is:" + secLarg);
    // }

    //QUESTION 10
    // public static void main(String[] args) {
    // //     int[] arr = {2, 8, 3, 5, 9, 24, 6};
    // //     int smallest = Integer.MAX_VALUE;
    // //     int secSml = Integer.MAX_VALUE;
    // //     for (int i = 0; i < arr.length; i++) {
    // //         if (arr[i] < smallest) {
    // //             secSml = smallest;
    // //             smallest = arr[i];
    // //         }else if (arr[i] < secSml && arr[i] != smallest) {
    // //             secSml = arr[i];
    // //         }
    // //     }
    // //     System.out.println("Second Smallest value is:" + secSml);
    // }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 5, 9, 7};
        int temp = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
            }
        }
        System.out.println("Array in ascending order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}
// Basic Level Questions

// Write a program to print all elements of an array.

// Find the sum of all elements in an array.

// Find the maximum element in an array.

// Find the minimum element in an array.

// Count how many even and odd numbers are in an array.

// Search a given element in an array.

// Reverse an array (you already did this 😄).

// Copy all elements from one array to another.

// 🌸 Intermediate Level Questions

// Find the second largest element in an array.

// Find the second smallest element.

// Sort the array in ascending order (without using built-in sort).

// Remove duplicates from an array.

// Find the sum of all positive numbers and negative numbers separately.

// Count how many times a particular number appears in an array.

// Merge two arrays into one.

// Print elements in alternate positions (like index 0, 2, 4…).

// Find the difference between the largest and smallest element.

// Check if the array is palindrome (same forward and backward).

// 🌟 Advanced / Logic Practice

// Move all zeroes to the end of the array.

// Find all pairs of elements whose sum is equal to a given number.

// Rotate the array by k positions (left or right).

// Find the frequency of each element.

// Print all unique elements in the array.

// Find the missing number in an array of 1 to N.

// Separate even and odd numbers into two different arrays.