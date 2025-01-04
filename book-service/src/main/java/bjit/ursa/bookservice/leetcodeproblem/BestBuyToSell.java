package bjit.ursa.bookservice.leetcodeproblem;

public class BestBuyToSell {
    public int maxProfit(int[] prices) {


        int profit = 0;
        int l = 0, r = 1;
        while(r < prices.length){
            if(prices[l] < prices[r]) profit = Math.max(profit, prices[r] - prices[l]);
            else l = r;
            r++;
        }
        return profit;

    }
}
