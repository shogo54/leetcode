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
 * Apporach: Map & Iteration
 * Runtime: 2 ms, faster than 87.67% of Java online submissions for Unique Number of Occurrences.
 * Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
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
