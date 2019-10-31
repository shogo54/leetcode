package array;

/**
 * @author Shogo Akiyama 
 * Solved on 08/29/2019
 * 
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * Difficulty: Easy
 * 
 * Approach: Math Formula
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Missing Number.
 * 
 * @see ArrayTest#testMissingNumber()
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
