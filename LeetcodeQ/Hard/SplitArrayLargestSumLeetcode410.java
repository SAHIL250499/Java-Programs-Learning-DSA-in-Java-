package LeetcodeQ.Hard;

import java.util.ArrayList;

public class SplitArrayLargestSumLeetcode410 {
    public static void main(String[] args) {
        int[] a={7,2,5,10,8};
        int m=2;

        System.out.println(split(a,m));

    }
    static int split(int[] arr,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        //binary search
        while (start<end){
            int mid=start+(end-start)/2;
            int sum1=0;
            int pieces=1;
            for (int j = 0; j < arr.length ; j++) {
                if(sum1+arr[j]>mid){
                    sum1=arr[j];
                    pieces++;
                }else {
                    sum1 += arr[j];
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return end;




    }
}
