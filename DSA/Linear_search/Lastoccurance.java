package Linear_search;

public class Lastoccurance {
     static int lastOccu(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                ans = i;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 4, 9};
        int target = 4;
        int ans =lastOccu(arr, target);
        System.out.println(ans);
    }
}
