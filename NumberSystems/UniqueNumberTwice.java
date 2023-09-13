package NumberSystems;

public class UniqueNumberTwice {
    public static void main(String[] args) {
        System.out.println(unumber(new int[]{2,3,4,1,2,1,3,6,4}));
    }
    static int unumber(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}
