package Functions;

import java.util.Scanner;

public class Func1 {
    public static void main(String[] args) {
        //Q: take input of 2 numbers and print the sum
        greeting();
        int ans=sum3(20,30);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    static void greeting(){
        Scanner in = new Scanner(System.in);
        String name=in.next();
        System.out.println("Hello "+name);
    }
}
