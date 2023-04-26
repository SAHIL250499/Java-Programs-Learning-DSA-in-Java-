package LeetcodeQ.Easy;

import java.util.Arrays;

public class SetMismatchLeetcode645 {
    public static void main(String[] args) {
        int[] nums={8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctidx=arr[i]-1;
            if(arr[i]!=arr[correctidx]){
                swap(arr,i,correctidx);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
