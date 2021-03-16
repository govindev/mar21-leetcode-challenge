package com.govindev.leetcode.challenge.mar21;

import java.util.List;
import java.util.ArrayList;

/***
 * Swapping Nodes in a Linked List
 * 
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3671/
 * 
 * @author Govind
 *
 */
class SwappingNodesInALinkedList {
	public ListNode swapNodes(ListNode head, int k) {
		List<ListNode> nodes = new ArrayList<>();
		ListNode current = head;
		while (current != null) {
			nodes.add(current);
			current = current.next;
		}
		ListNode kFrontNode = nodes.get(k - 1);
		ListNode kBackNode = nodes.get(nodes.size() - k);
		int value = kFrontNode.val;
		kFrontNode.val = kBackNode.val;
		kBackNode.val = value;
		return head;
	}
}

//  Definition for singly-linked list.
//public class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}
