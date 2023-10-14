package LeetcodeQ.Medium;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray1(nums));
    }

    //bruteforce solution On2
    static int maxSubArray(int[] nums) {
        int maxx=nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum=sum+nums[j];
                if(sum>maxx){
                    maxx=sum;
                }
            }

        }
        return maxx;
    }
//)Optimal soltution O(N)
    static int maxSubArray1(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=-1;
        int ansStart=-1;
        int ansEnd=-1;
        for (int i = 0; i < nums.length; i++) {
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.println(nums[i]);
        }
        if(max<0){
            max=0;
        }
        return max;
    }
}
