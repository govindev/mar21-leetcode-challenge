package com.govindev.leetcode.challenge.mar21;

/***
 * Integer to Roman
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3667/
 * 
 * @author Govind
 *
 */
public class IntegerToRoman {
	public String intToRoman(int n) {
		StringBuilder str = new StringBuilder();
		while (true) {
			if (n < 4) {
				for (int i = 1; i <= n; i++) {
					str.append("I");
				}
				return str.toString();
			} else if (n == 4) {
				str.append("IV");
				return str.toString();
			} else if (n == 5) {
				str.append("V");
				return str.toString();
			} else if (n < 9) {
				str.append("V");
				for (int i = 1; i <= (n - 5); i++) {
					str.append("I");
				}
				return str.toString();
			} else if (n == 9) {
				str.append("IX");
				return str.toString();
			} else if (n == 10) {
				str.append("X");
				return str.toString();
			} else if (n < 40) {
				int nn = n / 10;
				for (int i = 1; i <= nn; i++) {
					str.append("X");
				}
				n = n % 10;
			} else if (n == 40) {
				str.append("XL");
				return str.toString();
			} else if (n < 50) {
				str.append("XL");
				n = n % 10;
			} else if (n == 50) {
				str.append("L");
				return str.toString();
			} else if (n < 90) {
				str.append("L");
				int nn = n / 10;
				for (int i = 1; i <= nn - 5; i++) {
					str.append("X");
				}
				n = n % 10;
			} else if (n == 90) {
				str.append("XC");
				return str.toString();
			} else if (n < 100) {
				str.append("XC");
				n = n % 10;
			} else if (n == 100) {
				str.append("C");
				return str.toString();
			} else if (n < 400) {
				int nn = n / 100;
				for (int i = 1; i <= nn; i++) {
					str.append("C");
				}
				n = n % 100;
			} else if (n == 400) {
				str.append("CD");
				return str.toString();
			} else if (n < 500) {
				str.append("CD");
				n = n % 100;
			} else if (n == 500) {
				str.append("D");
				return str.toString();
			} else if (n < 900) {
				str.append("D");
				int nn = n / 100;
				for (int i = 1; i <= nn - 5; i++) {
					str.append("C");
				}
				n = n % 100;
			} else if (n == 900) {
				str.append("CM");
				return str.toString();
			} else if (n < 1000) {
				str.append("CM");
				n = n % 100;
			} else if (n == 1000) {
				str.append("M");
				return str.toString();
			} else if (n > 1000) {
				int nn = n / 1000;
				for (int i = 1; i <= nn; i++) {
					str.append("M");
				}
				n = n % 1000;
			}
		}
	}
}
