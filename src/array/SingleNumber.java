package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 * Difficulty: Easy
 * 
 * Appraoch: Set
 * Runtime: 7 ms, faster than 33.18% of Java online submissions for Single Number.
 * Memory Usage: 39.2 MB, less than 81.27% of Java online submissions for Single Number.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testSingleNumber()
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (set.contains(n)) {
				set.remove(n);
			} else {
				set.add(n);
			}
		}
		return set.iterator().next();
	}

}
