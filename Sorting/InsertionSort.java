package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={0,-23,56,18};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]>=arr[j-1]){
                    break;
                }
                else{
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
