package Files;

public class Main {

    public static void main(String[] args) {

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // for(int i=1; i<=4; i++){
        // for(int j=1; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // * * * * *
        // * *
        // * *
        // * * * * *
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=6; j++){
        // if(i == 1 ||j == 1 || i == 5 || j == 6){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println( );
        // }

        // *
        // * *
        // * * *
        // * * * *
        // int n = 4;
        // for(int i= 1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(" * ");
        // }
        // System.out.println( );
        // }

        // * * * *
        // * * *
        // * *
        // *
        // int n = 4;
        // for(int i= n; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print(" * ");
        // }
        // System.out.println( );
        // }

        // *
        // * *
        // * * *
        // * * * *
        // int n = 4;
        // for(int i= 1; i<=n; i++){
        // for(int j=1; j<=n-i; j++){
        // System.out.print(" ");
        // }
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println( );
        // }

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // int n = 5;
        // for(int i= 1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j +" ");
        // }
        // System.out.println( );
        // }

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // int n = 5;
        // for(int i= n; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print(j +" ");
        // }
        // System.out.println( );
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int n = 5;
        // int num = 1;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(num+ " ");
        // num++;
        // }
        // System.out.println( );
        // }

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // int sum = i+j;
        // if(sum%2 == 0){
        // System.out.print(" 1 ");
        // }else{
        // System.out.print(" 0 ");
        // }
        // }
        // System.out.println( );
        // }

        // * *
        // * * * *
        // * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * *
        // * * * *
        // * *

        // int n= 5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // int space = 2 * (n-i);
        // for(int j=1; j<=space; j++){
        // System.out.print(" ");
        // }
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // int space = 2*(n-i);
        // for(int j=1; j<=space; j++){
        // System.out.print(" ");
        // }
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *****
        // *****
        // *****
        // *****
        // *****
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // int spaces = n-i;
        // for(int j=1; j<=spaces; j++){
        // System.out.print(" ");
        // }for(int j=1; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println( );
        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // int spaces = n - i;
        // for(int j=1; j<=spaces; j++){
        // System.out.print(" ");
        // }for(int j=1; j<=i; j++){
        // System.out.print(i+ " ");
        // }
        // System.out.println( );
        // }

        // 1
        // 212
        // 32123
        // 4321234
        // 543212345
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // int spaces = n - i;
        // for(int j=1; j<=spaces; j++){
        // System.out.print(" ");
        // }for(int j=i; j>=1; j--){
        // System.out.print(j);
        // }for(int j=2; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println( );
        // }

        // *
        // ***
        // *****
        // *******
        // *********
        // *********
        // *******
        // *****
        // ***
        // *
        // METHOD 1
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // int spaces = n - i;
        // for(int j=1; j<=spaces; j++){
        // System.out.print(" ");
        // }for(int j=i; j>=1; j--){
        // System.out.print("*");
        // }for(int j=2; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println( );
        // }
        // for(int i=n; i>=1; i--){
        // int spaces1 = n - i;
        // for(int j=1; j<=spaces1; j++){
        // System.out.print(" ");
        // }for(int j=i; j>=1; j--){
        // System.out.print("*");
        // }for(int j=2; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println( );
        // }

        // METHOD 2
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=n-i; j++){
        // System.out.print(" ");
        // }

        // for(int j=1; j<=2*i-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        // for(int j=1; j<=n-i; j++){
        // System.out.print(" ");
        // }

        // for(int j=1; j<=2*i-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }
}
