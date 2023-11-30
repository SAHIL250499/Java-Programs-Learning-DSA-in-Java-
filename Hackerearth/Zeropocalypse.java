package Hackerearth;

import java.util.Scanner;

public class Zeropocalypse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T>0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]= sc.nextInt();
            }
            System.out.println(zeroppo(a,n));
            T--;
        }
    }

    private static long zeroppo(int[] a, int n) {
        int s=0;
        int e=0;
        int count0=0;
        long ans=1;
        if(n==1){
            if(a[0]!=0)
                return 1;
            else
                return -1;
        }
        else{
            while (s<n && e<n){
                if(a[e]==0){
                    count0++;
                    e++;
                }else{
                    if(count0>=(a[e]-a[s]-1) || (s!=e && a[s]>=a[e]))
                        return 0;
                    else{
                        if(count0!=0){
                            int tnum=a[e]-a[s]+1-2;
                            if(tnum<=0){
                                return 0;
                            }
                            long temp=permutpossibility(tnum,count0);
                            ans=((ans%1000000007)*(temp%1000000007))%1000000007;
                            count0=0;
                        }
                        s=e;
                        e++;
                    }
                }
            }
            if(count0>0)
                return -1;
            else
                return ans%1000000007;
        }


    }

    private static long permutpossibility(int tnum, int count0) {
        long comb=1;
        for (int i = 0; i < count0; i++) {
            comb=comb*(tnum-i);
            comb=comb/(i+1);
        }

        return comb;
    }

}
