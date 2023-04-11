package Assignments.Searching;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={};
        int[] b={1,2,3,4};
        double ans=findMedianSortedArrays(a,b);
        System.out.println(ans);

    }
    static double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length==0 && b.length==0){
            return -1;
        }
        if(a.length>b.length){
             return findMedianSortedArrays(b,a);
        }

        int start=0;
        int end=a.length;
        int Lentwoarr=a.length+b.length;
        int total=(Lentwoarr+1)/2;

        while(start<=end){

            int cut1=start+(end-start)/2;
            int cut2=total-cut1;

            int Lefta=(cut1>0)?a[cut1-1]:Integer.MIN_VALUE;
            int Leftb=(cut2>0)?b[cut2-1]:Integer.MIN_VALUE;
            int Righta=(cut1<a.length)?a[cut1]:Integer.MAX_VALUE;
            int Rightb=(cut2<b.length)?b[cut2]:Integer.MAX_VALUE;

            //if lefta<=rightb and leftb<=righta then we have cut the two arrays correctly.

            if(Lefta<=Rightb && Leftb<=Righta){
                DecimalFormat dec=new DecimalFormat("#.000");
                if((Lentwoarr)%2==0){
                    double res=((Math.max(Lefta,Leftb)+Math.min(Righta,Rightb)))/2.0;
                    return res;
                }
                return Math.max(Lefta,Leftb);

            }
            else if(Lefta>Rightb){
                end=cut1-1;
            }
            else{
                start=cut1+1;
            }
        }
        return -1;

    }
}
