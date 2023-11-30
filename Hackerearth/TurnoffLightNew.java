package Hackerearth;

import java.util.Scanner;

public class TurnoffLightNew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String[] bulb=sc.nextLine().split("");

        int l=1;
        while (true) {
            int op = bulbreq(bulb, n, l);
            if (op <= k) {
                break;
            }
            l++;
        }
        System.out.println(l);


    }
    static int bulbreq(String[] bulb,int n,int l){
        int count=0;
        int i=0;
        while (i<n){

            if(bulb[i].equals("1")){

                if(i+l-1 >n && i<n){
                    count++;
                    break;
                }

                count++;
                i=i+l;
            }
            else {
                i++;
            }

        }
        return count;
    }
}
