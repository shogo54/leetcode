package Array;

/**
 * @author Shogo Akiyama 
 * Solved on 08/29/2019
 * 
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - int missingNumber(int[] nums).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Missing Number.
 * 
 */

public class MissingNumber {

	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return nums.length * (nums.length + 1) / 2 - sum;
	}

}
