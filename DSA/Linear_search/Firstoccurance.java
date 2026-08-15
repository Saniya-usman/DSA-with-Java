package Linear_search;

public class Firstoccurance {
    static int FirstOccu(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 4, 9};
        int target = 4;
        int ans = FirstOccu(arr, target);
        System.out.println(ans);
    }
}
