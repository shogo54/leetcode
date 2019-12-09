package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/09/2019
 * 
 * 315. Count of Smaller Numbers After Self
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 * Difficulty: Hard
 * 
 * Approach: Binary Search & Iteration
 * Runtime: 18 ms, faster than 36.98% of Java online submissions for Count of Smaller Numbers After Self.
 * Memory Usage: 39 MB, less than 100.00% of Java online submissions for Count of Smaller Numbers After Self.
 * 
 * Time Complexity: O(n^2) <- O(n * (log(n) + n)) n for an iteration, log(n) for binary search, and n for an insertion
 * Space Complexity: O(n) for an extra array list
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testCountOfSmallerNumbersAfterSelf()
 */
public class CountOfSmallerNumbersAfterSelf {

	public List<Integer> countSmaller(int[] nums) {
		List<Integer> sortedList = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>(nums.length);

		for (int i = nums.length - 1; i >= 0; i--) {
			int index = binarySearch(sortedList, nums[i]);
			result.add(index);
		}

		Collections.reverse(result);
		return result;
	}

	private int binarySearch(List<Integer> list, int val) {
		if (list.size() == 0) {
			list.add(val);
			return 0;
		}

		double target = val - 0.5;
		int lo = 0;
		int hi = list.size() - 1;

		while (lo <= hi) {
			int m = lo + (hi - lo) / 2;
			if (list.get(m) < target) {
				lo = m + 1;
			} else {
				hi = m - 1;
			}
		}

		list.add(lo, val);
		return lo;
	}

}