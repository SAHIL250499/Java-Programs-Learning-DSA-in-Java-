package LeetcodeQ.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatedLeetcode442 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            int correctindx=nums[i]-1;
            if(correctindx!=i){
                l1.add(nums[i]);
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
