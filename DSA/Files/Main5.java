package Files;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        str[2] = "Saniya";
        System.out.println(Arrays.toString(str));

    }
}
