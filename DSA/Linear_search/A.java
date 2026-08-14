package Linear_search;

public class A {
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 9, 7, 65, 90, 23, 54, 76 };
        int target = 90;
        int ans = LinearSearch(arr, target);
        System.out.println("the target element is at index:"+ans);
    }
}
