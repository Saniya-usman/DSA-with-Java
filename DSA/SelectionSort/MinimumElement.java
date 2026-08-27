package SelectionSort;

public class MinimumElement {
    static int MinimumInSelectionSort(int[] arr){
        int n = arr.length;
        int minimum = 0;
        
            
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
        
        return arr[minimum];
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3, 2};
        int ans = MinimumInSelectionSort(arr);
            System.out.println(ans);
        
    }
}
