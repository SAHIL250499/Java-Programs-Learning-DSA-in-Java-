package Functions;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int a=20;
        int b=40;
        swap(a,b);


    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
