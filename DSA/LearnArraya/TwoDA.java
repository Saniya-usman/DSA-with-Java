package LearnArraya;
import java.util.Scanner;

public class TwoDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][3];
        System.out.println("Please enter the matrix elements:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        System.out.println("the matrix is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println( );
        }
        // // for (int i = 0; i < arr.length; i++) 
        // for (int[] i : arr) {
        //     System.out.println(Arrays.toString(i));
        // }


    //    var cars = new ArrayList<String>(5);
    //    cars.add("BMW");
    //    cars.add("Volvo");
    //    cars.add("Mazad");
    //    cars.add("Suzuki");
    //    cars.set(2, "Thar");
    //    cars.get(3);
    //    System.out.println(cars.get(3));
    //    cars.remove(2);
    //    cars.clear();
    //    cars.size();
    //    System.out.println(cars.size());
        // Collections.sort(cars);
        // System.out.println(cars);


        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for(int i=0; i<3; i++){
        //     list.add(new ArrayList<>());
        // }
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         list.get(i).add(sc.nextInt());
        //     }
        // }
        // System.out.println(list);
        sc.close();
    }

    }
