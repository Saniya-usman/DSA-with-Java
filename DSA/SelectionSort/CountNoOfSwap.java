package SelectionSort;

public class CountNoOfSwap {
    static int CountSwap(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            count++;
            }
    }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 6};
        int ans = CountSwap(arr);
        System.out.println(ans);
    }
}
