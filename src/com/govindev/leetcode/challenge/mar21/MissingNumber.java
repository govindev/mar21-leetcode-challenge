package com.govindev.leetcode.challenge.mar21;

/***
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3659/
 * 
 * Missing Number
 * 
 * @author Govind
 *
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int idealSum = (n) * (n + 1) / 2;
		int actualSum = 0;
		for (int i = 0; i < n; i++) {
			actualSum += nums[i];
		}
		return (idealSum - actualSum);
	}
}
