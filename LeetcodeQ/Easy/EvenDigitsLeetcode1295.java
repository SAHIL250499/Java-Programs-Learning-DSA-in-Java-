package LeetcodeQ.Easy;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitsLeetcode1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
        static int findNumbers(int[] nums) {
            int count=0;
            for (int num:nums) {
                if(even(num)){
                    count++;
                }

            }
            return count;
        }
        static boolean even(int n){
            int noofd=digits(n);
            return noofd%2==0;
        }
        //count no of digits in a number
        static int digits(int n){
            if (n<0){
                n=n*(-1);
            }
            if(n==0){
                return 1;
            }
            return (int)Math.log10(n)+1 ;
        }
}
