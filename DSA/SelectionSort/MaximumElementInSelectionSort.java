package SelectionSort;

public class MaximumElementInSelectionSort {
    static int MEISS(int[] arr){

        int n = arr.length;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return arr[max];
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 3, 2};
        System.out.println(MEISS(arr));
    }
}
