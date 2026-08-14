package practice_set_2;

public class FindLargest {
    static int Largest(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {-10, -3, -45, -7, -29};
        int ans = Largest(arr);
        System.out.println(ans);
    }
}
