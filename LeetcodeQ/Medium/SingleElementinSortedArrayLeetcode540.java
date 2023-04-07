package LeetcodeQ.Medium;

public class SingleElementinSortedArrayLeetcode540 {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,8,8};
        System.out.println(bsearchsingleelement(nums));
    }
    static int bsearchsingleelement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start<mid && nums[mid]==nums[mid-1]){
                if(mid%2==0){
                    end=mid-2;
                }
                else{
                    start=mid+1;
                }
            }
            else if(mid<end && nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    start=mid+2;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                return nums[mid];
            }
        }
        return -1;
    }
}
