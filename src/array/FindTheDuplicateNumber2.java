package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/01/2019
 * 
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Difficulty: Medium
 * 
 * Approach: Floyd's Cycle Detection (Tortoise and Hare)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Duplicate Number.
 * Memory Usage: 37.6 MB, less than 40.68% of Java online submissions for Find the Duplicate Number.
 * 
 * @see ArrayTest#testFindTheDuplicateNumber()
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
