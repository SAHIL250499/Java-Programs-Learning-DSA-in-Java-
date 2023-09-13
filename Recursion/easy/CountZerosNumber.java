package Recursion.easy;

public class CountZerosNumber {
    public static void main(String[] args) {
        System.out.println(countzero(302004,0));
    }

    static int countzero(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return countzero(n/10,c+1);
        }
        else{
            return countzero(n/10,c);
        }
    }
}
