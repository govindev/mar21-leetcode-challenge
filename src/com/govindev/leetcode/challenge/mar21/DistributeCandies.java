package com.govindev.leetcode.challenge.mar21;

import java.util.HashSet;
import java.util.Set;

/***
 * Distribute Candies
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3657/
 * 
 * @author Govind
 *
 */
public class DistributeCandies {
	public int distributeCandies(int[] candyType) {
		Set<Integer> uniqueCandies = new HashSet<>();
		for (int i = 0; i < candyType.length; i++) {
			uniqueCandies.add(candyType[i]);
		}
		int allowed = candyType.length / 2;
		return (allowed > uniqueCandies.size()) ? uniqueCandies.size() : allowed;
	}
}
