package array;

/**
 * @author Shogo Akiyama 
 * Solved on 02/16/2020
 * 
 * 238. Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 * Difficulty: Medium
 * 
 * Approach: Left And Right Product Lists
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
 * Memory Usage: 47.7 MB, less than 5.51% of Java online submissions for Product of Array Except Self.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testProductOfArrayExceptSelf()
 */
public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] front = new int[nums.length];
		int[] back = new int[nums.length];
		int[] result = new int[nums.length];

		front[0] = 1;
		back[nums.length - 1] = 1;

		for (int i = 1; i < nums.length; i++) {
			front[i] = front[i - 1] * nums[i - 1];
		}

		for (int i = nums.length - 2; i >= 0; i--) {
			back[i] = back[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = front[i] * back[i];
		}

		return result;
	}

}
