package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        Scanner in =new Scanner(System.in);

        int[][] arr=new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            //for each col in evry row
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j]=in.nextInt();
                
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
