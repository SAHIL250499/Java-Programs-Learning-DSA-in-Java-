package Hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class TurnOfflights {
    public static void main(String[] args) {
        //BufferedReader
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String[] bulb=sc.nextLine().split("");
        int i=0;
        int j=n-1;
        while(i<n){
            if(bulb[i].equals("1")){
                break;
            }
            i++;
        }
        while(j>=0){
            if(bulb[j].equals("1")){
                break;
            }
            j--;
        }
        //for l=1 count no of 1's
        int countfor1=0;
        for (int l = i; l <= j; l++) {
            if(bulb[l].equals("1")){
                countfor1++;
            }
        }
        if(countfor1<=k){
            //l will be 1
            System.out.println("1");
        }
        else{
            //l is not 1
            int len=j-i+1;
            if(k==1){
                System.out.println(len);
            }
            else{
                int l=2;
                int oper=0;
                while (oper<k){
                    if(len%l!=0){
                        oper=len/l+1;
                    }else{
                        oper=len/l;
                    }
                    l++;
                }
                System.out.println(l);
            }
        }
    }


}
