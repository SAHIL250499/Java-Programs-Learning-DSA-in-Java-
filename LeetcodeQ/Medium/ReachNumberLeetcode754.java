package LeetcodeQ.Medium;

import java.math.BigInteger;

//https://leetcode.com/problems/reach-a-number/
public class ReachNumberLeetcode754 {
    public static void main(String[] args) {
        System.out.println(reachNumber(3));
    }

    static int reachNumber(int target) {
        int start=1;
        int end=target;
        long  pos=0;
        int minSteps=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long dist=(mid*(mid+1))/2;

            if(dist>=target){
                pos=dist;
                minSteps=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        long diff=pos-target;

        if(diff%2!=0){
            if(minSteps%2!=0){
                minSteps+=2;
            }
            else
                minSteps+=1;
        }
        return minSteps;



    }
}
