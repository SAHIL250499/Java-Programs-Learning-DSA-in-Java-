package Hackerearth;

import java.util.Scanner;

public class modpairs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];

        int count=0;
        boolean[] isread=new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }


        //loop

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (isread[i] == true) {
                    i++;
                } else {
                int op = (((a[i] % p + a[j] % p) % p) * ((a[i] % p * a[i] % p) % p + (a[j] % p * a[j] % p) % p) % p) % p;
                if (op == k) {
                    isread[i] = true;
                    count++;
                }
            }

            }
        }

        System.out.println(count);
    }


}
