package GFG;

public class BinarySearch_InfiniteArray {
    public static void main(String[] args) {
        //start with the box of size 2
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;//Another way of writing mid=(start+end)/2 as if start and end will be bigger number then there sum will exceed the int can hold.
            if (target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }

}
