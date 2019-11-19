package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/18/2019
 * 
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 * Difficulty: Medium
 * 
 * Approach: Two Pointers
 * Runtime: 2 ms, faster than 95.27% of Java online submissions for Container With Most Water.
 * Memory Usage: 40.3 MB, less than 89.10% of Java online submissions for Container With Most Water.
 * 
 * @see ArrayTest#testContainerWithMostWater()
 */
public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int l = 0;
		int r = height.length - 1;
		int max = 0;

		while (l < r) {
			int currentMin = Math.min(height[l], height[r]);
			max = Math.max((r - l) * currentMin, max);
			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}

		return max;
	}

}
