//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int curProf=0;
        int finalProf=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            curProf=prices[i]-min;
            if(finalProf<curProf)
            {
                finalProf=curProf;
            }
        }
        return finalProf;
    }
}
