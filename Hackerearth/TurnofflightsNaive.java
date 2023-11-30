package Hackerearth;

import java.util.Scanner;

public class TurnofflightsNaive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String[] bulb=sc.nextLine().split("");

        int l=1;
        if(k==1){
            int c=0;
            for (int i = 0; i < bulb.length; i++) {
                if(bulb[i].equals("1")){
                    c++;
                }
            }
            System.out.println(c);
        }else {
            while (true) {
                int op = bulbreq(bulb, n, l);
                if (op <= k) {
                    break;
                }
                l++;
            }
            System.out.println(l);
        }

    }
    static int bulbreq(String[] bulb,int n,int l){
        int count=0;
        boolean bulbFound=false;
        int bulbFoundAt=0;
        int i=0;
        while (i<n){
            int j=i+l-1;
            if(j>=n){
                count++;
            }
            bulbFound=false;
            while (j>=i && j>=0 && j<n){
                if(bulb[j].equals("1")){
                    bulbFound=true;
                    bulbFoundAt=j;
                    count++;
                    break;
                }
                j--;
            }
            i=i+l;
        }
        return count;
    }
}
