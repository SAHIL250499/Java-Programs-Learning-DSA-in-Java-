package LeetcodeQ.Easy;

import java.util.Arrays;

public class MissingNumberLeetcode268 {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        cyclicsort(nums,nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    static void cyclicsort(int[] arr,int n) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]!=n && arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else{
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
