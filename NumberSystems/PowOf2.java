package NumberSystems;

public class PowOf2 {
    public static void main(String[] args) {
        int n=16;
        if(n==0){
            System.out.println("false");
            return;
        }
        boolean ans=(n & (n-1))==0;
        System.out.println(ans);
    }
}
