package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/21/2020
 * Time: 8m
 * 
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
 * Memory Usage: 42.4 MB, less than 5.59% of Java online submissions for Move Zeroes.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testMoveZeros()
 */
public class MoveZeroes2 {

	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];

				if (i != index) {
					nums[i] = 0;
				}
				index++;
			}
		}
	}

}
