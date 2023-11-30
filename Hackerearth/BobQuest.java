package Hackerearth;

import java.util.HashMap;

public class BobQuest {
    public static void main(String[] args) {
        int n=8;
        int x=3;
        int y=2;
        int[] a={2,3,2,1,1,1,1,1};
        subarray(n,x,y,a);
    }
    private static void subarray(int n,int x,int y,int[] a){
        int i=0;
        int ans=0;
        while (i<n){
            if(a[i]==y){
             ans=Math.max(maxlength(i,a,x),ans);
            }
            i++;
        }
        System.out.println(ans);
    }
    private static int maxlength(int index,int[] a,int x){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max1=0;
        for (int j = index; j >=0 ; j--) {

            if(map.containsKey(a[j])){
                map.put(a[j],map.get(a[j])+1);
            }else{
                map.put(a[j],1);
            }
            if(map.size()>x){
                break;
            }
            if(map.size()==x){
                max1=Math.max(max1, index-j+1);
            }

        }
            for (int j = index + 1; j < a.length; j++) {
                if (map.containsKey(a[j])) {
                    map.put(a[j], map.get(a[j]) + 1);
                } else {
                    map.put(a[j], 1);
                }
                if (map.size() > x) {
                    break;
                }
                if (map.size() == x) {
                    max1 = Math.max(max1, j - index + 1);
                }

            }

        return max1;
    }
}
