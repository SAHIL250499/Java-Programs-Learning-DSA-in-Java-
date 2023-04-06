package Assignments.Searching;
//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(binarySearchtogetsqrt(8));
    }
    static int binarySearchtogetsqrt(int n){
        long start=1;
        long end=n/2;
        long ans=0;
        //base case
        if(n<2){
            return n;
        }
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==n){
                return (int)mid;
            }
            else if(mid*mid<n){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;

            }
        }
        return (int)ans;
    }
}
