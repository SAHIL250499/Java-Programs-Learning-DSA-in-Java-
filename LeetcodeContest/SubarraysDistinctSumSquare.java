package LeetcodeContest;

import java.util.*;

public class SubarraysDistinctSumSquare {
    public static void main(String[] args) {
        System.out.println(sumCounts(new ArrayList<Integer>(List.of(1,2,1))));
    }

    static int sumCounts(List<Integer> nums) {
        int ans=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size() ; j++) {
                Set<Integer> distinct = new HashSet<>(nums.subList(i, j + 1));
                ans=ans+(distinct.size()* distinct.size());
            }
        }
        return ans;
    }
}
