package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 05/20/2020
 * Time: 5m30s
 * 
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 * 
 * Approach: Hash Set & Iteration
 * Runtime: 5 ms, faster than 71.78% of Java online submissions for Contains Duplicate.
 * Memory Usage: 47.2 MB, less than 5.17% of Java online submissions for Contains Duplicate.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testContainsDuplicate()
 */
public class ContainsDuplicate2 {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			set.add(i);
		}
		return set.size() != nums.length;
	}

}
