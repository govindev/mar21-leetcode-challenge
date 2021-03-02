package com.govindev.leetcode.challenge.mar21;

import java.util.Arrays;

/***
 * Set Mismatch
 * 
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3658/
 * 
 * @author Govind
 *
 */
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		int[] op = new int[2];
		int totalSum = 0;
		int n = nums.length;
		int idealSum = (n * (n + 1)) / 2;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];
			if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
				// repetetive element
				op[0] = nums[i];
			}
		}
		// missing element
		op[1] = op[0] + (idealSum - totalSum);
		return op;
	}
}
