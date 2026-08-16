public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices){
        int minPrices = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++){
            int profit = prices[i] - minPrices;

            if (minPrices > prices[i]){
                minPrices = prices[i];
            }
            if (maxProfit < profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " +result);
    }
}

/*
Approach: Single Pass/ Greedy
Time Complexity: O(n)
Space Complexity: O(1)
 */
