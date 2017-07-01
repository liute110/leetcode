package array;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeToBuyAndSellStockII bt = new BestTimeToBuyAndSellStockII();
		int[] nums = {2};
		System.out.println(bt.maxProfit(nums));
	}
	
	
	public int maxProfit(int[] prices) {
        int res = 0;
        for(int i=0;i < prices.length - 1;i++) {
        	if(prices[i] < prices[i+1])
        		res += prices[i+1] - prices[i];
        }
        return res;
    }
	

}
