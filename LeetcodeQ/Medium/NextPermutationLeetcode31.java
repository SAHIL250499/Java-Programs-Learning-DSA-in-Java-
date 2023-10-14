package LeetcodeQ.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutationLeetcode31 {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
//        List<List<Integer>> all=new ArrayList<>();
//        permut(arr,all,0);
//        for (List a1 : all){
//            System.out.println(a1);
//        }
        permut1(arr);
        System.out.println(Arrays.toString(arr));
    }
    //optimal solution Next permutation

    static void permut1(int[] arr){
        int n= arr.length;
        int index=-1;
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            //reversing
            for (int i = 0; i < n/2; i++) {
                swap(arr,i,n-i-1);
            }
            return;
        }

        for (int i = n-1; i >=index ; i--) {
            if (arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }
        //reversing
        for(int i=index+1;i<(n-index-1)/2+index+1;i++){
            swap(arr,i,n-i+index);
        }
    }




    //finding all possible permutation
    static void permut(int[] arr,List<List<Integer>> all,int index){
        if(index==arr.length){
            List<Integer> ds=new ArrayList<>();
            for (int j : arr) {
                ds.add(j);
            }
            all.add(ds);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr,index,i);
            permut(arr,all,index+1);
            swap(arr,index,i);
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
