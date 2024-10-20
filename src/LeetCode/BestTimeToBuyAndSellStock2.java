package LeetCode;

public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 bs = new BestTimeToBuyAndSellStock2();
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(bs.maxProfit(prices));
    }
}
