package array;

/**
 * @author Shogo Akiyama 
 * Solved on 09/27/2019
 * 
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/
 * Difficulty: Medium
 * 
 * Approach: Divide & Conquer
 * Runtime: 1 ms, faster than 98.86% of Java online submissions for Maximum Product Subarray.
 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Maximum Product Subarray.
 * 
 * @see ArrayTest#testMaximumProductSubarray()
 */
public class MaximumProductSubarray {

	public int maxProduct(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		return maxProduct(nums, 0, nums.length - 1);
	}

	private int maxProduct(int[] nums, int s, int e) {
		if (s == e) {
			return nums[s];
		}

		int[] negatives = new int[2];
		boolean flag = false;
		int count = 0;
		for (int i = s; i <= e; i++) {
			if (nums[i] == 0) {
				int a = (s <= i - 1) ? maxProduct(nums, s, i - 1) : 0;
				int b = (e >= i + 1) ? maxProduct(nums, i + 1, e) : 0;
				a = Math.max(a, b);
				return Math.max(a, 0);

			} else if (nums[i] < 0) {
				count++;
				if (flag) {
					negatives[1] = i;
				} else {
					negatives[0] = i;
					flag = true;
				}
			}
		}

		if (count == 1) {
			int a = (s <= negatives[0] - 1) ? maxProduct(nums, s, negatives[0] - 1) : 0;
			int b = (e >= negatives[0] + 1) ? maxProduct(nums, negatives[0] + 1, e) : 0;
			return Math.max(a, b);

		} else if (count % 2 == 0) {
			int prod = 1;
			for (int i = s; i <= e; i++) {
				prod *= nums[i];
			}
			return prod;

		} else {
			int middle = 1;
			for (int i = negatives[0] + 1; i <= negatives[1] - 1; i++) {
				middle *= nums[i];
			}

			int left = 1;
			for (int i = s; i <= negatives[0]; i++) {
				left *= nums[i];
			}

			int right = 1;
			for (int i = negatives[1]; i <= e; i++) {
				right *= nums[i];
			}

			return Math.max(middle * right, middle * left);
		}
	}

}
