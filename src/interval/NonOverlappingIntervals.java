package interval;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/14/2019
 * 
 * 435. Non-overlapping Intervals
 * https://leetcode.com/problems/non-overlapping-intervals/
 * Difficulty: Medium
 * 
 * Approach: Greedy Interval Scheduling
 * Runtime: 31 ms, faster than 49.01% of Java online submissions for Non-overlapping Intervals.
 * Memory Usage: 36.2 MB, less than 62.50% of Java online submissions for Non-overlapping Intervals.
 * 
 * @see IntervalTest#testNonOverlappingIntervals()
 */
public class NonOverlappingIntervals {

	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0) {
			return 0;
		}

		Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);

		int start = intervals[0][0];
		int minEnd = intervals[0][1];
		int count = 0;

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i - 1][0] == intervals[i][0]) {
				minEnd = Math.min(minEnd, intervals[i][1]);
				count++;
			} else {
				start = intervals[i][0];
				if (minEnd > start) {
					minEnd = Math.min(minEnd, intervals[i][1]);
					count++;
				} else {
					minEnd = intervals[i][1];
				}
			}
		}

		return count;
	}

}
