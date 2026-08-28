package SelectionSort;

public class KthLargestElement {
    static int KthLEISS(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[n - k];
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        System.out.println(KthLEISS(arr, 2));
        
    }
}
