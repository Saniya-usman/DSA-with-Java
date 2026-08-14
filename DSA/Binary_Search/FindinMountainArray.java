package Binary_Search;

public class FindinMountainArray {
    static int  FindinMountain(int[] arr, int target){
        int peak = peakelement(arr);
        int firstTry = orderAgnosticcBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticcBS(arr, target, peak+1, arr.length-1);
    }

    static int peakelement(int[] arr){
    int start = 0;
    int end = arr.length-1;

    while (start < end){
        int mid = start + (end - start)/2;
        if (arr[mid] > arr[mid+1]) {
            end = mid;
        }else{
            start = mid+1;
        }
    }
    return start;
}
   static int orderAgnosticcBS(int[] arr , int target, int start, int end){


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
    int[] arr = {1,2,3,4,5,3,1};
    int ans = FindinMountain(arr, 3);
    System.out.println("Index:"+ans);
}
}
