package Assignments.Searching;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        System.out.println(findMedianSortedArrays(a,b));

    }
    static int findMedianSortedArrays(int[] a, int[] b) {
        if(a.length>b.length){
            int[] temp=a;
            a=b;
            b=temp;
        }
        int total=a.length+b.length;
        int half=total/2;
        int start=0;
        int end=a.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;//A
            int j=half-mid-2; //LeftofB
            int Aleft,Aright,Bleft,Bright;
            if(mid>=0){
                Aleft=a[mid];
            }else{
                Aleft=Integer.MIN_VALUE;
            }
            if(mid+1 < a.length){
                Aright=a[mid+1];
            }else{
                Aright=Integer.MAX_VALUE;
            }
            if(j>=0){
                Bleft=b[j];
            }else{
                Bleft=Integer.MIN_VALUE;
            }
            if(j+1 <b.length){
                Bright=b[j+1];
            }else{
                Bright=Integer.MAX_VALUE;
            }

            //partition is correct
            if(Aleft<=Bright && Bleft<=Aright){
                //odd
                if(total%2!=0){
                   return Math.min(Aright,Bright);
                }
                //even
                return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2;
            }
            else if(Aleft>Bright){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;

    }
}
