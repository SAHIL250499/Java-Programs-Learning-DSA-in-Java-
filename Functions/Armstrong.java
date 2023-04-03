package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter three digit number");
//        Scanner in =new Scanner(System.in);
//        int n=in.nextInt();
//        System.out.println(isArm(n));
        for(int i=100;i<1000;i++){
            if(isArm(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isArm(int n){
        int sum=0;
        int a=n;
        while (n>0){
            int r=n%10;
            sum+=r*r*r;
            n=n/10;
        }
        return sum == a;
    }
}
