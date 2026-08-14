package Linear_search;

public class SearchInRange {
    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;
        int ans = LinearSearch(arr, target, 1, 4);
        System.out.println("The target element in the range of 1 to 4 is at index: " + ans);
    }
}
