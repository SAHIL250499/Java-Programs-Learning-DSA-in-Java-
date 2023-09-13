package NumberSystems;

public class UniqueNumberThrice {
    public static void main(String[] args) {
        System.out.println(unumber(new int[]{2,2,3,3,3,100,2,7,7,8,7,8,8}));

    }
    static int unumber(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans+=Integer.parseInt(Integer.toBinaryString(arr[i]));
        }
        int temp=ans;
        int mul10=1;

        int res=0;
        while(temp!=0) {
            int lastd = temp % 10;
            lastd=lastd%3;
            res=res+mul10*lastd;

            temp = temp / 10;
            mul10*=10;
        }
        ans=Integer.parseInt(Integer.toString(res),2);
        return ans;
    }
}
