package com.govindev.leetcode.challenge.mar21;

import java.util.Arrays;
import java.util.Comparator;

/***
 * Short Encoding of Words
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3662/
 * 
 * @author Govind
 *
 */

public class ShortEncodingOfWords {
	public static void main(String[] args) {
		String[] words = { "time", "me", "bell" };
		System.out.println(minimumLengthEncoding(words));
	}

	private static int minimumLengthEncoding(String[] words) {
		StringBuilder encodedString = new StringBuilder();
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		for (String word : words) {
			if (encodedString.indexOf(word + "#") <= -1) {
				encodedString.append(word + "#");
			}
		}
		return encodedString.length();
	}
}
