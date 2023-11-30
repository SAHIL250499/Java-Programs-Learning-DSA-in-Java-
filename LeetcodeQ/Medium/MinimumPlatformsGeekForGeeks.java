package LeetcodeQ.Medium;

import java.util.Arrays;
import java.util.Collections;

public class MinimumPlatformsGeekForGeeks {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr,dep,arr.length));
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=1;
        int plat=1;
        int maxx=1;
        while (i<n && j<n){
            if(dep[i]>=arr[j]){
                plat++;
                j++;
            } else if (dep[i]<arr[j]) {
                plat--;
                i++;
            }
            if(plat>maxx){
                maxx=plat;
            }

        }
        return maxx;
    }
}
