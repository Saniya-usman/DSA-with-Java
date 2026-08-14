package practice_set_2;

public class AscandSort {
    static boolean Sort(int[] arr){
         
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,2, 4, 5};
        System.out.println(Sort(arr));
    }
    
}
