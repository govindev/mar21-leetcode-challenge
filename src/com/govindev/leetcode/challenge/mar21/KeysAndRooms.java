package com.govindev.leetcode.challenge.mar21;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

/***
 * Keys And Rooms
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3677/
 * 
 * @author Govind
 *
 */

public class KeysAndRooms {
	Set<Integer> visited;

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		visited = new HashSet<>();
		visited.add(0);
		visit(0, rooms);
		if (visited.size() < rooms.size()) {
			return false;
		}
		return true;
	}

	public void visit(int nextRoom, List<List<Integer>> rooms) {
		List<Integer> keys = rooms.get(nextRoom);
		for (Integer key : keys) {
			int oldVisitCount = visited.size();
			visited.add(key);
			int newVisitCount = visited.size();
			if (newVisitCount > oldVisitCount) {
				visit(key, rooms);
			} else {
				continue;
			}
		}
		return;
	}
}