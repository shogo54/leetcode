package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/01/2019
 * 
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Difficulty: Medium
 * 
 * Approach: Brute Force
 * Runtime: 112 ms, faster than 5.11% of Java online submissions for Find the Duplicate Number.
 * Memory Usage: 38.3 MB, less than 37.29% of Java online submissions for Find the Duplicate Number.
 * 
 * @see ArrayTest#testFindTheDuplicateNumber()
 */
public class FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;
	}

}
