package LeetcodeQ.Medium;

public class BestTimetoBuySellStockLeetcode121 {
    public static void main(String[] args) {
        int[] prices={1,2};
        System.out.println(maxProfit1(prices));

    }
    public static int maxProfit(int[] prices) {
     //brute force
       int min=Integer.MAX_VALUE;
        for (int i = 0; i <prices.length-1 ; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                if((prices[i]-prices[j])<min){
                    min=prices[i]-prices[j];
                }
            }
        }
        if(min>=0){
            return 0;
        }else {
            return Math.abs(min);
        }

    }

    //Optimal Solution
    public static int maxProfit1(int[] prices) {
        int Profit=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
           //update min
            if(prices[i]<min){
                min=prices[i];
            }
            if((prices[i]-min)>Profit){
                Profit=prices[i]-min;
            }
        }
        return Profit;

    }
}
