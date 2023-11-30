package LeetcodeQ.Easy;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterLeetcode496 {
    public static void main(String[] args) {
    int[] a={4,1,2};
    int[] b={1,3,4,2};
    int[] o=nextGreaterElementOptimized(a, b);
        System.out.println(Arrays.toString(o));
    }

    //naive
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for(int j=0;j< nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    ans[i]=-1;
                    for(int k = j+1; k<nums2.length ; k++) {
                        if(nums2[k]>nums2[j]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return ans;

    }

    //using stack
    public static int[] nextGreaterElementOptimized(int[] nums1, int[] nums2){
        int[] ans=new int[nums2.length];
        int[] ans1=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = nums2.length-1; i >=0 ; i--) {
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                    stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=-1;

            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]) ans1[i]=ans[j];
            }
        }
        return ans1;
    }

}
