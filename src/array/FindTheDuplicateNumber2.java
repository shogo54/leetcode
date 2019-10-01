package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/01/2019
 * 
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - int findDuplicate(int[] nums).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Duplicate Number.
 * Memory Usage: 37.6 MB, less than 40.68% of Java online submissions for Find the Duplicate Number.
 * 
 */

public class FindTheDuplicateNumber2 {

	public int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[nums[0]];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		fast = 0;
		while (fast != slow) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}

}
