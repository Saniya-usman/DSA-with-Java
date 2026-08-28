package SelectionSort;

public class KthSmallestElement {
    static int KthSMISS(int[] arr, int k){
       int n = arr.length;
       for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
       }
       return arr[k - 1];
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        System.out.println(KthSMISS(arr, 2));
    }
}
