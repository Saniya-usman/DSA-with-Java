package practice_set_2;

public class FindIndex {
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                count++;
          
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 1};
        int target = 2;
       
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }
}
