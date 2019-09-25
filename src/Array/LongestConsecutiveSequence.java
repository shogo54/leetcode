package Array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 09/23/2019
 * 
 * 128. Longest Consecutive Sequence
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * Difficulty: Hard
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - int longestConsecutive(int[] nums)
 * - class Group.
 * 
 * Runtime: 7 ms, faster than 63.28% of Java online submissions for Longest Consecutive Sequence.
 * Memory Usage: 38.2 MB, less than 62.07% of Java online submissions for Longest Consecutive Sequence.
 * 
 */

public class LongestConsecutiveSequence {
	
	public int longestConsecutive(int[] nums) {
		HashMap<Integer, Group> nodes = new HashMap<Integer, Group>();
		for (int i : nums) {
			if (nodes.containsKey(i)) {
				continue;
			}
			if (nodes.containsKey(i - 1)) {
				if (nodes.containsKey(i + 1)) {
					nodes.put(i, nodes.get(i - 1).add().merge(nodes.get(i + 1)));
				} else {
					nodes.put(i, nodes.get(i - 1).add());
				}

			} else if (nodes.containsKey(i + 1)) {
				nodes.put(i, nodes.get(i + 1).add());

			} else {
				nodes.put(i, new Group(1));
			}
		}

		int max = 0;
		for (Group group : nodes.values()) {
			if (group.num > max) {
				max = group.num;
			}
		}

		return max;
	}

	static class Group {
		int num;
		boolean active;
		Group parent;

		Group(int n) {
			num = n;
			active = true;
		}

		Group merge(Group g) {
			num += g.num;
			g.active = false;
			g.parent = this;
			return this;
		}

		Group add() {
			if (active) {
				num++;
				return this;
			} else {
				return parent.add();
			}
		}
	}
}
