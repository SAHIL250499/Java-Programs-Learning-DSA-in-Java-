package Others;

import java.util.Scanner;

public class Counting_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        while (n>0){
            int r=n%10;
            if(r==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
