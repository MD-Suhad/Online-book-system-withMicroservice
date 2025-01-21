package bjit.ursa.bookservice.leetcodeproblem;

public class bestTimeToBuy {
    public int maxProfit(int[] prices){
        int hold = Integer.MAX_VALUE, notHold = 0;
        for(int stockPrice: prices){
            int prevHold = hold, prevNotHOld = notHold;
            hold = Math.max(prevHold, prevHold + stockPrice);
        }
        return notHold;
    }
}
