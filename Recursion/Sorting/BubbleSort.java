package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble1(arr ,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble1(int[] a,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(a[col]>a[col+1]){
                int temp=a[col];
                a[col]=a[col+1];
                a[col+1]=temp;
            }
            bubble1(a,row,col+1);
        }else{
            bubble1(a,row-1,0);
        }
    }


}
