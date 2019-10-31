package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/31/2019
 * 
 * 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/
 * Difficulty: Medium
 * 
 * Approach: Iteration & Two Pass
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
 * Memory Usage: 35.1 MB, less than 99.21% of Java online submissions for Sort Colors.
 * 
 * Follow up: Could you come up with a one-pass algorithm using only constant space?
 * 
 * @see ArrayTest#testSortColors()
 */
public class SortColors {
	
	public void sortColors(int[] nums) {
		int[] colors = new int[3];
		for (int n : nums) {
			colors[n]++;
		}

		int index = 0;
		int colorIndex = 0;
		while (index < nums.length) {
			if (colors[colorIndex]-- > 0) {
				nums[index++] = colorIndex;
			} else {
				colorIndex++;
			}
		}
	}
	
}
