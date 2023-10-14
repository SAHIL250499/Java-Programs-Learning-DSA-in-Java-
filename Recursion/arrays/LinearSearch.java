package Recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,3,1,4,4,5};
        int target=4;
//        System.out.println(search(arr,target,0));
//        System.out.println(findallIndex(arr,target,0,new ArrayList<Integer>()));
        System.out.println(findallIndex2(arr,target,0));
    }

    static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    static int search(int[] arr,int target,int i) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr,target,i+1);

    }
    static ArrayList<Integer> findallIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findallIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> findallIndex2(int[] arr,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //This will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findallIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
