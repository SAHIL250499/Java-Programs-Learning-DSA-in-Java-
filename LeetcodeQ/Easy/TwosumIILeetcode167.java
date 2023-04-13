package LeetcodeQ.Easy;

import java.util.Arrays;

public class TwosumIILeetcode167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4}, 6)));
    }

//    O(nlogn) solution
//    static int[] twoSum(int[] numbers, int target) {
//        for(int i=0;i<numbers.length-1;i++){
//            int start=i+1;
//            int end=numbers.length-1;
//            while(start<=end){
//                int mid=start+(end-start)/2;
//                int sum1=numbers[i]+numbers[mid];
//                if(sum1==target){
//                    return new int[]{i+1,mid+1};
//                }
//                else if(sum1>target){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}

//Ologn solution

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum1 = numbers[start] + numbers[mid];
            if (sum1 > target) {
                end = mid - 1;
            }
            if (sum1 < target) {
                start = mid + 1;
            }
            if(start==mid){
                return new int[]{start+1,end+1};
            }
            if (sum1 == target) {
                return new int[]{start + 1, mid + 1};
            }
        }
        return new int[]{-1, -1};
    }
}