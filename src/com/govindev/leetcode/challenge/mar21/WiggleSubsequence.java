package com.govindev.leetcode.challenge.mar21;

/***
 * Wiggle Subsequence
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3676/
 * 
 * @author Govind
 *
 */
public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
		int length = nums.length;
		if (length == 0)
			return 0;
		if (length == 1)
			return 1;
		boolean pPos = false;
		boolean pNeg = false;
		int count = 1;
		for (int i = 1; i <= nums.length - 1; i++) {
			int value = nums[i] - nums[i - 1];
			if (pPos) {
				if (value < 0) {
					pPos = false;
					pNeg = true;
					count++;
					continue;
				}
			} else if (pNeg) {
				if (value > 0) {
					pPos = true;
					pNeg = false;
					count++;
					continue;
				}
			} else {

				if (value > 0) {
					pPos = true;
					count++;
				} else if (value < 0) {
					pNeg = true;
					count++;
				}
			}
		}
		return count;
	}
}
