package GFG;

public class RotationCountinRotatedSortedArray_GFG {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        int pivot=findpivot(arr);
        if(pivot==-1){
            System.out.println(0);
        }
        else{
            System.out.println(pivot+1);
        }


    }
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
