package Binary_Search;

public class FirstAndLastP {
    static int[] searchRange(int[] arr, int target){
    int[] ans = {-1, -1};

    int start = 0;
    int end = arr.length - 1;
     while (start <= end) {
        int mid = start + (end - start)/2;
        if (target < arr[mid]) {
            end = mid -1;
        }else if (target > arr[mid]) {
            start = mid + 1;
        }else{
            ans[0] = mid;
            end = mid -1;
        }
        
     }

        start = 0;
        end = arr.length - 1;
     while (start <= end) {
        int mid = start + (end - start)/2;
        if (target < arr[mid]) {
            end = mid -1;
        }else if (target > arr[mid]) {
            start = mid + 1;
        }else{
            ans[1] = mid;
           start = mid + 1;
        }
        
     }
     return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7};
        int[] result = searchRange(arr, 4);
        System.out.println(result[0] +" " + result[1]);
    }
}
