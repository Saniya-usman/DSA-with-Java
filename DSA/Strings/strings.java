import java.util.ArrayList;

public class strings {
public static void main(String[] args) {
    // System.out.println(40);
    // System.out.println("saniya");
    // System.out.println(new int[]{2, 3, 6,5 ,8});

    // String name = null;
    // System.out.println(name);
    // float a = 453.75652f;
    // System.out.printf("Formated number is %.2f", a);
    // System.out.printf("\n Hello my name is %s and i am very %s", "Saniya", "Cool girl");

    // System.out.println('a' + 'b');
    //  System.out.println("saniya" + new ArrayList<>());


    String series = "";
    for (int i = 0; i < 26; i++) {
        char ch = (char)('a' + i);
        System.out.println(ch);
        series = series + ch;
    }
    System.out.println(series);
}
    
}