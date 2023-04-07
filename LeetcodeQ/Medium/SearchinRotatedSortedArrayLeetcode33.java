package LeetcodeQ.Medium;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchinRotatedSortedArrayLeetcode33 {
    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(search(nums,0));
    }
    static int search(int[] nums,int target){
        int pivot =findpivot1Duplicates(nums);
        if(pivot==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);



    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    //this will not work for duplicate values
    static int  findpivot(int[] arr){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;//Another way of writing mid=(start+end)/2 as if start and end will be bigger number then there sum will exceed the int can hold.
            if(mid<end && arr[mid]>arr[mid+1]){
                ans=mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                ans=mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return ans;
    }
    static int  findpivot1Duplicates(int[] arr){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;//Another way of writing mid=(start+end)/2 as if start and end will be bigger number then there sum will exceed the int can hold.
            if(mid<end && arr[mid]>arr[mid+1]){
                ans=mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                ans=mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}

