package LeetcodeQ.Hard;

import java.util.Arrays;

public class FirstMissingPositiveLeetcode41 {
    public static void main(String[] args) {
        int[] arr={7,8,9,11,12};
       System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    static void cyclicsort(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i] !=arr[correct]){
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
