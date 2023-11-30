package LeetcodeQ.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortColorsLeetcode75 {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors3(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        //bubble sort
        int n=nums.length;
        boolean swapped=false;
        for (int i = 0; i < n-1; i++) {
            swapped=false;
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    static void sortColors1mergesort(int[] nums,int low,int high) {
        //merge sort
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        //left
        sortColors1mergesort(nums,low,mid);
        sortColors1mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    static void merge(int[] nums,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }
        //insert if remaining
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        //insert ele from temp to main data structure

        for (int k = low; k <=high; k++) {
            nums[k]=temp.get(k-low);
        }

    }


    //Optimal Solution

    public static void sortColors3(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while (mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
