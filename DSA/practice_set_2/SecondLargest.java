package practice_set_2;



public class SecondLargest {
    static int Largest(int[] arr){
    if (arr.length == 0) {
        return 0;
    }
    int largest = arr[0];
    int secondLarg = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLarg = largest;
            largest = arr[i];
            System.out.println(largest);
        }
        else if (arr[i] < largest && arr[i] > secondLarg) {
            secondLarg = arr[i];
        }
    }
    return secondLarg;
    }
     public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 5};
        int ans = Largest(arr);
        System.out.println(ans);

     }
}
