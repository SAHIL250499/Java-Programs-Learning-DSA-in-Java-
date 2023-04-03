public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
          int[] arr={99,80,75,22,11,10,5,2,-3};
        if (arr[0]<arr[arr.length-1]){
            System.out.println(binarySearchasc(arr,22));
        } else  {
            System.out.println(binarySearchdesc(arr,22));
        }
    }
    static int binarySearchdesc(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;//Another way of writing mid=(start+end)/2 as if start and end will be bigger number then there sum will exceed the int can hold.
            if (target>arr[mid]){
                end=mid-1;
            }
            if(target<arr[mid]){
                start=mid+1;
            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchasc(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
