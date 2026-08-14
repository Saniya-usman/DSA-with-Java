package Function;

import java.util.Scanner;

public class Main {
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
