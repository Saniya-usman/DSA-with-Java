public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {20, 8, 9, 3, 2, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
        }
       
        double Average = (double)sum / arr.length;
        System.out.println(sum);
        System.out.println(Average);
    }
}
