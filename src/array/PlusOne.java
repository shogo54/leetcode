package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/21/2020
 * Time: 11m
 * 
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 * difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 39.3 MB, less than 5.64% of Java online submissions for Plus One.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the numbers of elements in the array
 * 
 * @see ArrayTest#testPlusOne()
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}

		// in case where all digits were 9
		if (digits[0] == 0) {
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			return res;
		}
		return digits;
	}

}
