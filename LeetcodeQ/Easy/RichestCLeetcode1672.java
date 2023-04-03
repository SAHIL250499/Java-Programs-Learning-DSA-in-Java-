package LeetcodeQ.Easy;

public class RichestCLeetcode1672 {
    public static void main(String[] args) {
        int[][] acc={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(acc));
    }
    static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int acc = 0; acc < accounts[person].length; acc++) {
                sum+=accounts[person][acc];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
