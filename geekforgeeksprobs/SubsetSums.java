package geekforgeeksprobs;

import java.util.Collections;

public class SubsetSums {
    public static void main(String[] args) {
        subsetsum(new int[]{3,1,2},0,0);
    }
    static void subsetsum(int[] arr,int index,int sum){
        if(index==arr.length){
            System.out.println(sum);
            return;
        }
        //Decided to pick
        subsetsum(arr,index+1,sum+arr[index]);
        //Not picked
        subsetsum(arr,index+1,sum);
    }
}
