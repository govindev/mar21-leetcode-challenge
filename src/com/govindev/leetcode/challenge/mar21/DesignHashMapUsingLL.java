package com.govindev.leetcode.challenge.mar21;

/***
 * Design HashMap
 * https://leetcode.com/submissions/detail/464967061/?from=explore&item_id=3663
 * 
 * @author Govind
 *
 */
public class DesignHashMapUsingLL {
	Node root;

	/** Initialize your data structure here. */
	public void MyHashMap() {
		root = null;
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		if (root == null) {
			root = new Node(key, value, null);
		} else {
			Node temp = root;
			Node last = root;
			while (temp != null) {
				if (temp.key == key) {
					temp.value = value;
					return;
				}
				last = temp;
				temp = temp.next;
			}
			Node newNode = new Node(key, value, null);
			last.next = newNode;
		}
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		Node temp = root;
		while (temp != null) {
			if (temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		return -1;
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
		Node temp = root;
		Node prev = root;
		while (temp != null) {
			if (temp.key == key) {
				if (temp == root) {
					root = root.next;
				} else {
					prev.next = temp.next;
				}
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}
}

class Node {
	int key;
	int value;
	Node next;

	public Node(int key, int value, Node next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}