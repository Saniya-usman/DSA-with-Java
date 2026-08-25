package BubbleSort;

public class KthLargestElement  {
    static int kthLargest(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        System.out.println(kthLargest(arr, 1));
    }
}
