package com.govindev.leetcode.challenge.mar21;

/***
 * Design HashMap
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3663/
 * 
 * @author Govind
 *
 */
public class DesignHashMap {
	int[] values;

	/** Initialize your data structure here. */
	public void MyHashMap() {
		values = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			values[i] = -1;
		}
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		values[key] = value;
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		return values[key];
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
		values[key] = -1;
	}
}
