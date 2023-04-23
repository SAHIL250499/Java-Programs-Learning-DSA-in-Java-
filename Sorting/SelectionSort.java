package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-1,0,-39,7,89};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max item in the remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxindex(int[] arr,int start,int last){
        int maxx=start;
        for (int i = start+1; i <=last; i++) {
            if(arr[maxx]<arr[i]){
                maxx=i;
            }
        }
        return maxx;
    }
}
