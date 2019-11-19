package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/17/2019
 * 
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Difficulty: Easy
 * 
 * Approach: Mark by Negativing
 * Runtime: 2 ms, faster than 95.27% of Java online submissions for Container With Most Water.
 * Memory Usage: 40.3 MB, less than 89.10% of Java online submissions for Container With Most Water.
 * 
 * @see ArrayTest#testFindAllNumbersDisappearedInAnArray()
 */
public class FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}

		return list;
	}

}
