package Linear_search;

public class Countoccurance {
    static int CountOccu(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 4, 9, 4, 6, 4};
        int target = 4;
        int ans = CountOccu(arr, target);
        System.out.println(ans);
    }
}
