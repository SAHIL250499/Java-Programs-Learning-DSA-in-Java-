package LeetcodeQ.Easy;

import java.util.Arrays;

public class BuildArrayLeetcode1920 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }
//    static int[] buildArray(int[] nums) {
//        int[] a=new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            a[i]=nums[nums[i]];
//        }
//        return a;
//    }
static int[] buildArray(int[] nums) {
    int n=nums.length;
    for (int i = 0; i < nums.length; i++) {
        nums[i]=nums[i]+n*((nums[nums[i]])%n);
    }
    for (int j = 0; j < nums.length; j++) {
        nums[j]=nums[j]/n;
    }
    return nums;
}
}
