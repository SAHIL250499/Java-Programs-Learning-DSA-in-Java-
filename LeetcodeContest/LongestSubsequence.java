package LeetcodeContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestSubsequence {
    public static void main(String[] args) {
        lengthOfLongestSubsequence(new ArrayList<Integer>(List.of(1,2,3,4,5)),9);
    }

    static void lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int s=0;
        int e=1;
        int[] ans=new int[nums.size()];
        nums.sort(Comparator.naturalOrder());
        while (s<nums.size() && e<nums.size()){
            if ((nums.get(s)+nums.get(e))==target){
                System.out.println(nums.subList(s, e+1));
            } else if ((nums.get(s)+nums.get(e))>target) {
                s++;
            }else{
                e++;
            }
        }
        System.out.println(-1);
    }
}
