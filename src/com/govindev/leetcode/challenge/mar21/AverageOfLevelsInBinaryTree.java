package com.govindev.leetcode.challenge.mar21;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/***
 * Average of Levels in Binary Tree
 * 
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3661/
 * 
 * @author Govind
 *
 */
public class AverageOfLevelsInBinaryTree {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> averages = new ArrayList<>();
		if (root == null) {
			return averages;
		}
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(root);
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			int elementsCount = 0;
			double elementsSum = 0;
			while (!stack1.isEmpty()) {
				TreeNode current = stack1.pop();
				elementsSum += current.val;
				elementsCount++;
				if (current.left != null) {
					stack2.push(current.left);
				}
				if (current.right != null) {
					stack2.push(current.right);
				}
			}
			if (elementsCount > 0) {
				averages.add(elementsSum / elementsCount);
				elementsCount = 0;
				elementsSum = 0;
			}
			while (!stack2.isEmpty()) {
				TreeNode current = stack2.pop();
				elementsSum += current.val;
				elementsCount++;
				if (current.left != null) {
					stack1.push(current.left);
				}
				if (current.right != null) {
					stack1.push(current.right);
				}
			}
			if (elementsCount > 0) {
				averages.add(elementsSum / elementsCount);
			}
		}
		return averages;

	}
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
