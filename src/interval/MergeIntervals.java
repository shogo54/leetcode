package interval;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/13/2019
 * 
 * 56. Merge Intervals
 * https://leetcode.com/problems/merge-intervals/
 * Difficulty: Medium
 * 
 * Approach: Sort & Recursion
 * Runtime: 6 ms, faster than 88.41% of Java online submissions for Merge Intervals.
 * Memory Usage: 37.4 MB, less than 98.55% of Java online submissions for Merge Intervals.
 * 
 * @see IntervalTest#testMergeIntervals()
 */
public class MergeIntervals {

	public int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		int count = helper(intervals, 0, 0);
		int[][] result = new int[intervals.length - count][2];
		int index = 0;

		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i] != null) {
				result[index] = intervals[i];
				index++;
			}
		}

		return result;
	}

	private int helper(int[][] input, int index, int count) {
		if (index + 2 > input.length) {
			return count;
		}

		if (input[index][1] >= input[index + 1][0]) {
			input[index + 1][0] = Math.min(input[index][0], input[index + 1][0]);
			input[index + 1][1] = Math.max(input[index][1], input[index + 1][1]);
			input[index] = null;
			count++;
		}

		return helper(input, index + 1, count);
	}

}
