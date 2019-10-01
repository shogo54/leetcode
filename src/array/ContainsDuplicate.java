package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/27/2019
 * 
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - boolean containsDuplicate(int[] nums).
 * 
 * Runtime: 9 ms, faster than 51.82% of Java online submissions for Contains Duplicate.
 * Memory Usage: 44 MB, less than 62.93% of Java online submissions for Contains Duplicate.
 * 
 */

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> seen = new HashSet<Integer>();
		for (int n : nums) {
			if (seen.contains(n)) {
				return true;
			}
			seen.add(n);
		}
		return false;
	}

}
