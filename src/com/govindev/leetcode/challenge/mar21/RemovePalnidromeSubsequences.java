package com.govindev.leetcode.challenge.mar21;

/***
 * Remove Palindromic Subsequences
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3665/
 * 
 * @author Govind
 *
 */
public class RemovePalnidromeSubsequences {
	public static void main(String[] args) {
		String s = "bbaabaa";
		System.out.println(removePalindromeSub(s));
	}

	public static int removePalindromeSub(String s) {
		if (s.equals(""))
			return 0;
		if (isPalindrome(s)) {
			return 1;
		}
		int z = 1;
		int n = s.length();
		while (z < n) {
			if (isPalindrome(s.substring(0, n - z)) && isPalindrome(s.substring(n - z)))
				return 2;
			z++;
		}
		return 0;
	}

	private static boolean isPalindrome(String s) {
		if (s.length() == 1) {
			return true;
		}
		for (int i = 0, j = s.length() - 1; i < s.length() && j > 0; i++, j--) {
			if (i >= j)
				return true;
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
