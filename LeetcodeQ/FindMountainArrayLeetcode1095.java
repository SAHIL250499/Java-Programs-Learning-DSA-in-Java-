package LeetcodeQ;

public class FindMountainArrayLeetcode1095 {
    public static void main(String[] args) {
        int[] arr={1,5,2};
        int target=2;
        System.out.println(findInMountainArray(target,arr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
      int peak=PeakSearch(mountainArr);
      int ans=-1;
      ans=binarysearch(mountainArr,target,0,peak);
      if (ans==-1){
          ans=binarysearch(mountainArr,target,peak+1,mountainArr.length-1);
      }
      return ans;

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
    static int PeakSearch(int[] arr){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;//Another way of writing mid=(start+end)/2 as if start and end will be bigger number then there sum will exceed the int can hold.
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
