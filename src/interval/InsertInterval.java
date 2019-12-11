package interval;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/11/2019
 * 
 * 57. Insert Interval
 * https://leetcode.com/problems/insert-interval/
 * Difficulty: Hard
 * 
 * Approach: Iteration
 * Runtime: 3 ms, faster than 24.04% of Java online submissions for Insert Interval.
 * Memory Usage: 41.7 MB, less than 68.75% of Java online submissions for Insert Interval.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of intervals
 * 
 * @see IntervalTest#testInsertInterval()
 */
public class InsertInterval {
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> list = new ArrayList<int[]>();
		boolean added = false;

		for (int[] i : intervals) {
			if (!added && i[0] >= newInterval[0]) {
				list.add(newInterval);
				added = true;
			}
			list.add(i);
		}

		if (!added) {
			list.add(newInterval);
		}

		int index = 1;
		int count = 0;

		while (index < list.size()) {
			int[] prev = list.get(index - 1);
			int[] curr = list.get(index);

			if (prev[1] >= curr[0]) {
				curr[0] = prev[0];
				curr[1] = Math.max(curr[1], prev[1]);
				prev[0] = -1;
				prev[1] = -1;
				count++;
			}
			index++;
		}

		int[][] result = new int[list.size() - count][2];
		int j = 0;

		for (int[] i : list) {
			if (i[0] != -1 && i[1] != -1) {
				result[j] = i;
				j++;
			}
		}

		return result;
	}
	
}
