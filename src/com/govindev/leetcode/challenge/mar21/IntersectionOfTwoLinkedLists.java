package com.govindev.leetcode.challenge.mar21;

import java.util.Set;
import java.util.HashSet;

/***
 * Intersection of Two Linked Lists
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3660/
 * 
 * @author Govind
 *
 */
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> nodes = new HashSet<>();
		while (headA != null) {
			nodes.add(headA);
			headA = headA.next;
		}
		int length = nodes.size();
		while (headB != null) {
			length++;
			nodes.add(headB);
			if (length != nodes.size()) {
				return headB;
			}
			headB = headB.next;
		}

		return null;
	}
}

//Definition for singly-linked list.

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}