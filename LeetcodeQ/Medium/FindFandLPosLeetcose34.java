package LeetcodeQ.Medium;

public class FindFandLPosLeetcose34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
        int target=7;
//        System.out.println(Arrays.toString(searchRange(nums,target)));
        System.out.println(binarysearchFirstOcc(nums,target));

    }
//    static int[] searchRange(int[] nums,int target){
//
//    }
    static int binarysearchFirstOcc(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int f=-7;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                f=mid;
                end=mid-1;
            }
        }
        if (f<0){
            return -1;
        }
        return f;
    }
    static int binarysearchLastOcc(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int l=-7;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                l=mid;
                start=mid+1;
            }
        }
        if (l<0){
            return -1;
        }
        return l;
    }
    static int[] searchRangebrute(int[] nums,int target){
        int start;
        int end;
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        for (start = 0; start < nums.length; start++) {
            if(nums[start]==target){
                break;
            }
        }
        for (end = nums.length-1; end >=0 ; end--) {
            if(nums[end]==target){
                break;
            }
        }
        if (end<start){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{start,end};
        }
    }
}
