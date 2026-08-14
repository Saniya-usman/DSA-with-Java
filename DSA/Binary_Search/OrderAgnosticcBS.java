package Binary_Search;

public class OrderAgnosticcBS {
    static int orderAgnosticcBS(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
            else{
                if (target > arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1;
            }
            
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {98, 76, 54, 34, 32, 21, 12 , 9, 5, 3, 2};
        int ans = orderAgnosticcBS(arr, 9);
        System.out.println(ans);
    }
}
