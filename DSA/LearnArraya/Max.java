package LearnArraya;

public class Max {
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 98, 2, 45,34};
        System.out.println(max(arr));
    }
}
