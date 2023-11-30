package Hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SwapSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            int ans=swap(a,b,n,k);
            System.out.println(ans);

            T--;
        }
    }

    static int swap(int[] a,int[] b,int n,int k){
        HashMap<Integer,Integer> isswapped1=new HashMap<>();
        //first loop to swap first k items
        int i=0;
        int c1=0;
        int sum=0;
        int minind=0;
        while (c1<k && i<n){
            if(b[i]>a[i]){
                isswapped1.put(i,b[i]);
                c1++;
            }
            i++;
        }
        //get first sum

        for (int j = 0; j < n; j++) {
            if(isswapped1.containsKey(j)){
                sum+=b[j];
            }else{
                sum+=a[j];
            }
        }
        int minvalue=Collections.min(isswapped1.values());
        for (Map.Entry<Integer,Integer> index:isswapped1.entrySet()){
            if(index.getValue()==minvalue){
                minind=index.getKey();
                break;
            }
        }
        while (i<n){
            //find next min and update sum if min < b[i]
            if(b[minind]<b[i] && b[i]>a[i]){
                isswapped1.put(i,b[i]);
                int sum1=sum-b[minind]+a[minind]+b[i]-a[i];
                //update minind
                if(sum1>sum){
                    sum=sum1;
                }
                isswapped1.remove(minind);
                int minval=Collections.min(isswapped1.values());
                for (Map.Entry<Integer,Integer> index:isswapped1.entrySet()){
                    if(index.getValue()==minval){
                        minind=index.getKey();
                        break;
                    }
                }
            }
            i++;
        }

        return sum;
    }


}
