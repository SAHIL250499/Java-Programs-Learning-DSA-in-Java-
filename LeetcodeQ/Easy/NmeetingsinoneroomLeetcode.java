package LeetcodeQ.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NmeetingsinoneroomLeetcode {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        sortarr(start,end);
    }
    static class  meeting{
        int start;
        int end;
        int pos;
        meeting(int start,int end,int pos){
            this.start=start;
            this.end=end;
            this.pos=pos;
        }
        public String toString(){
            int[] out={this.start,this.end,this.pos};
            return Arrays.toString(out);
        }
    }

    static class sortbyend implements Comparator<meeting>{
        public int compare(meeting a,meeting b){
            if(a.end<b.end){
                return -1;
            } else if (a.end>b.end) {
                return 1;
            } else if (a.pos<b.pos) {
                return -1;
            }
            return 1;
        }
    }


    static void sortarr(int[] start,int[] end){
        ArrayList <meeting> arr=new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            arr.add(new meeting(start[i],end[i],i+1));
        }
        sortbyend mc=new sortbyend();
        Collections.sort(arr,mc);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr.get(0).pos);
        int limit=arr.get(0).end;
        for (int i = 1; i < start.length; i++) {
            if(arr.get(i).start>limit){
                limit=arr.get(i).end;
                ans.add(arr.get(i).pos);
            }
        }

        System.out.println(ans);

        
    }

}

