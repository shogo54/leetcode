package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/24/2019
 * 
 * 1207. Unique Number of Occurrences
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * difficulty: Easy
 * 
 * Approach: Map & Iteration
 * Runtime: 3 ms, faster than 57.33% of Java online submissions for Intersection of Two Arrays II.
 * Memory Usage: 37 MB, less than 83.87% of Java online submissions for Intersection of Two Arrays II.
 * 
 * @see ArrayTest#testUniqueNumberOfOccurrences()
 */
public class UniqueNumberOfOccurrences {
	
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> used = new HashSet<Integer>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer val : map.values()) {
			if (used.contains(val)) {
				return false;
			}
			used.add(val);
		}

		return true;
	}
	
}
