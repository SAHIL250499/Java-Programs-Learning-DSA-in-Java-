package LeetcodeQ.Easy;

import java.util.*;

public class PascalTriangleLeetcode118 {
    public static void main(String[] args) {
        generate(5);


    }
    static void generate(int numRows) {
        List<List<Integer>> finalans=new ArrayList<List<Integer>>();

        for (int m = 1; m <= numRows; m++) {
            ArrayList<Integer> ansmain=new ArrayList<>();
            int ans=1;
            ansmain.add(ans);
            for (int i = 1; i < m; i++) {
                ans=ans*(m-i);
                ans=ans/i;
                ansmain.add(ans);
            }
            finalans.add(ansmain);
        }

        for(List arr:finalans){
            System.out.println(arr);
        }

    }

}
