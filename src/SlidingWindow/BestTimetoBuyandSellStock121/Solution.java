package SlidingWindow.BestTimetoBuyandSellStock121;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class Solution {
    public int maxProfit(int[] prices){
        int max = 0;
        for(int i = 0; i < prices.length; i++ ){
            int right = i + 1;
            while(right < prices.length && prices[i] < prices[right]){
                max = Math.max(max, prices[right] - prices[i]);
                right++;
            }
        }
        return max;
    }
    //Sliding windows
    //Two pointers, left and right. When right value > left value, start to buy
    //then left keep still, right keep moving to the end, and calculate and update the profit

}
