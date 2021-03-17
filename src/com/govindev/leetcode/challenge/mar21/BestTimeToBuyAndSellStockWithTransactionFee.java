package com.govindev.leetcode.challenge.mar21;

/***
 * Best Time to Buy and Sell Stock with Transaction Fee
 * 
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3674/
 * 
 * @author Govind
 *
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
	public int maxProfit1(int[] prices, int fee) {
		int[] maxProfits = new int[prices.length];
		maxProfits[prices.length - 1] = 0;
		for (int i = prices.length - 2; i >= 0; i--) {
			int j = prices.length - 1;
			int maxProfit = maxProfits[i + 1];
			while (i < j) {
				int profit = ((prices[j] - prices[i]) - fee) + maxProfits[j];
				maxProfit = (profit > maxProfit) ? profit : maxProfit;
				j--;
			}
			maxProfits[i] = maxProfit;
		}
		return maxProfits[0];

	}

	public int maxProfit(int[] prices, int fee) {
		int cash = 0, hold = -prices[0];
		for (int i = 1; i < prices.length; i++) {
			cash = Math.max(cash, hold + prices[i] - fee);
			hold = Math.max(hold, cash - prices[i]);
		}
		return cash;
	}
}
