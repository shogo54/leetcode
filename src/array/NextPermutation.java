package array;

import java.util.Arrays;

/**
 * @author Shogo Akiyama 
 * Solved on 11/28/2019
 * 
 * 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/
 * Difficulty: Medium
 * 
 * Approach: Swap and Reverse
 * Runtime: 1 ms, faster than 90.02% of Java online submissions for Next Permutation.
 * Memory Usage: 40.5 MB, less than 46.00% of Java online submissions for Next Permutation.
 * 
 * Time Complexity: O(n log(n)) (because of Arrays.sort)
 * Space Complexity: O(n) (because of Arrays.sort)
 * 
 * @see ArrayTest#testNextPermutation()
 */
public class NextPermutation {

	public void nextPermutation(int[] nums) {
		int len = nums.length;

		for (int i = len - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				int next = Integer.MAX_VALUE;
				int nextIndex = -1;
				for (int j = len - 1; j > i; j--) {
					if (nums[j] > nums[i] && nums[j] < next) {
						next = nums[j];
						nextIndex = j;
					}
				}

				swap(nums, i, nextIndex);
				Arrays.sort(nums, i + 1, len);
				return;
			}
		}

		for (int i = 0; i < len / 2; i++) {
			swap(nums, i, len - 1 - i);
		}

	}

	private void swap(int[] nums, int i, int j) {
		int keep = nums[i];
		nums[i] = nums[j];
		nums[j] = keep;
	}

}
