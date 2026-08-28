package SelectionSort;

public class CountComparisons {
    static int CountComm(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
                count++;
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6};
        System.out.println(CountComm(arr));
    }
}
