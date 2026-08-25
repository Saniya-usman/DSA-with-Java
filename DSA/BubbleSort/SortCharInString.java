package BubbleSort;

public class SortCharInString {
    static String SortCharecter(String str){
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str ="sanu";
        System.out.println(SortCharecter(str));
    }
}
