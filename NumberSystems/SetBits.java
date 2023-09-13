package NumberSystems;



public class SetBits {
    public static void main(String[] args) {
        int n=45;
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count=0;
//        while(n>0){
//            count++;
//            n-=(n& -n);
//        }

        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
