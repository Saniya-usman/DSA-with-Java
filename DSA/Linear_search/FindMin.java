package Linear_search;

public class FindMin {
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 14, 28};
        System.out.println("The minimum value is:"+min(arr));
    }
}
