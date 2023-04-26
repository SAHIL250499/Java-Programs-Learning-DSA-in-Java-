package LeetcodeQ.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllnumbersDisappearedLeetcode448 {
    public static void main(String[] args) {
        int[] arr={1,1};
        List<Integer> ans=findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            int correctindx=nums[i]-1;
            if(correctindx!=i){
                l1.add(i+1);
            }
        }
        return l1;
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
