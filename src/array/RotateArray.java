package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/19/2020
 * Time: 18m
 * 
 * 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/
 * Difficulty: Easy
 * 
 * Approach: 3 Reverses
 * Runtime: 1 ms, faster than 43.54% of Java online submissions for Rotate Array.
 * Memory Usage: 42.2 MB, less than 5.77% of Java online submissions for Rotate Array.
 * 
 * Time complexity : O(n)
 * Space complexity : O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testRotateArray()
 */
public class RotateArray {

	public void rotate(int[] nums, int k) {
		k = k % nums.length;

		for (int i = 0; i < nums.length / 2; i++) {
			swap(nums, i, nums.length - 1 - i);
		}

		for (int i = 0; i < k / 2; i++) {
			swap(nums, i, k - 1 - i);
		}

		for (int i = 0; i < (nums.length - k) / 2; i++) {
			swap(nums, i + k, nums.length - 1 - i);
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
