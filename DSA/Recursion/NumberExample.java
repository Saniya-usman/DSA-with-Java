package Recursion;

public class NumberExample {
    static void print1(int n) {
        System.out.println(n);
        print2(n);
    }
     static void print2(int n) {
        System.out.println(2);
        print3(n);
    }
     static void print3(int n) {
        System.out.println(3);
        print4(n);
    }
     static void print4(int n) {
        System.out.println(4);
        print5(n);
    }
     static void print5(int n) {
        System.out.println(5);
    }
   
   
     public static void main(String[] args) {
        print1(1);
    }
}
