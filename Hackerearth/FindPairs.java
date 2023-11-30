package Hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String L=sc.next();
        long L1=Long.parseLong(L);
        String R=sc.next();
        long R1=Long.parseLong(R);
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=Long.parseLong(sc.next());
        }
        System.out.println(pairs(a,n,L1,R1));
    }
    private static int pairs(long[] a,int n,long l,long r){
        Arrays.sort(a);
        int ans=0;
        for (int i = 0; i < n-1; i++) {
            if(a[i]>r){
                break;
            }
            for (int j = i+1; j < n; j++) {
                if(a[i]+a[j]>r){
                    break;
                }
                if(a[i]+a[j]>=l && a[i]+a[j]<=r) {
                    if (((a[i] & 1) != 1 && (a[j] & 1) == 1) || ((a[i] & 1) == 1 && (a[j] & 1) != 1)) {
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
}
