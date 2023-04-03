package LeetcodeQ;

public class PeakIndexLeetcode852 {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println(PeakSearch(arr));

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
