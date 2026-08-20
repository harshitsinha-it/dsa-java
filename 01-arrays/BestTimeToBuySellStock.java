/*
==================================================
LeetCode #121 - Best Time to Buy and Sell Stock

Problem:

You are given an array prices where prices[i] is the
price of a given stock on the ith day.

You want to maximize your profit by choosing a single
day to buy one stock and choosing a different day in
the future to sell that stock.

Return the maximum profit you can achieve from this
transaction. If you cannot achieve any profit, return 0.

Topic     : Arrays
==================================================
*/
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
