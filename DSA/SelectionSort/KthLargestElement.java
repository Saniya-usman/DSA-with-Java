package SelectionSort;

public class KthLargestElement {
    static int KthLEISS(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr[n - k];
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        System.out.println(KthLEISS(arr, 2));
        
    }
}
