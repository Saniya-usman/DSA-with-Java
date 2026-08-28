package SelectionSort;

public class KthSmallestElement {
    static int KthSMISS(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        System.out.println(KthSMISS(arr, 3));
    }
}
