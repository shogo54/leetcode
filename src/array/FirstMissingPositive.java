package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/22/2019
 * 
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * Difficulty: Hard
 * 
 * Approach: Mark as Negatives
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for First Missing Positive.
 * Memory Usage: 34.9 MB, less than 100.00% of Java online submissions for First Missing Positive.
 * 
 * @see ArrayTest#testFirstMissingPositive()
 */
public class FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {

		// step1: check if the array has anything positive. if not, return 1
		int positiveNum = -1;

		for (int n : nums) {
			if (n > 0) {
				positiveNum = n;
				break;
			}
		}

		if (positiveNum < 0) {
			return 1;
		}

		// step2: change all 0 and negatives to positiveNum
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 1) {
				nums[i] = positiveNum;
			}
		}

		// step3: mark by negativing the value of nums[abs(nums[i]-1)]
		// if abs(nums[i]-1) is a valid index
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (val < nums.length) {
				nums[val] = -Math.abs(nums[val]);
			}
		}

		// step4: look for the first index with positive value,
		// indicating there is not such value in the array.
		int index = 0;
		while (index < nums.length && nums[index] < 0) {
			index++;
		}

		return index + 1;
	}

}
