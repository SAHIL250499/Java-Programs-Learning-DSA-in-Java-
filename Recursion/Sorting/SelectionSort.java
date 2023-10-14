package Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int maxx=0;
        selection(arr,arr.length,0,maxx);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr,int r,int c,int maxx){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[maxx]<arr[c]){
                maxx=c;
            }
            selection(arr,r,c+1,maxx);
        }else{
            //swap
            int temp=arr[maxx];
            arr[maxx]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
    }
}
