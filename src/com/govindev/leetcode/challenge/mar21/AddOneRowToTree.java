package com.govindev.leetcode.challenge.mar21;

import java.util.Stack;

/***
 * Add One Row To Tree
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3666/
 * 
 * @author Govind
 *
 */
public class AddOneRowToTree {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		TreeNode newNode;
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		if (d == 1) {
			newNode = new TreeNode(v);
			newNode.left = root;
			root = newNode;
		} else {
			// Travel till the level d-1
			int level = 1;
			stack1.push(root);
			while (true) {
				if (d - level == 1) {
					if (!stack1.isEmpty()) {
						while (!stack1.isEmpty()) {
							TreeNode poppedNode = stack1.pop();
							if (poppedNode != null) {
								newNode = new TreeNode(v);
								newNode.left = poppedNode.left;
								poppedNode.left = newNode;
								newNode = new TreeNode(v);
								newNode.right = poppedNode.right;
								poppedNode.right = newNode;
							}
						}
					} else if (!stack2.isEmpty()) {
						while (!stack2.isEmpty()) {
							TreeNode poppedNode = stack2.pop();
							if (poppedNode != null) {
								newNode = new TreeNode(v);
								newNode.left = poppedNode.left;
								poppedNode.left = newNode;
								newNode = new TreeNode(v);
								newNode.right = poppedNode.right;
								poppedNode.right = newNode;
							}
						}
					}
					break;
				} else {
					if (stack1.isEmpty()) {
						while (!stack2.isEmpty()) {
							TreeNode poppedNode = stack2.pop();
							if (poppedNode != null) {
								stack1.push(poppedNode.left);
								stack1.push(poppedNode.right);
							}
						}
					} else if (stack2.isEmpty()) {
						while (!stack1.isEmpty()) {
							TreeNode poppedNode = stack1.pop();
							if (poppedNode != null) {
								stack2.push(poppedNode.left);
								stack2.push(poppedNode.right);
							}
						}
					}
					level++;
				}
			}
		}
		return root;
	}
}
