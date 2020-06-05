package array;

/**
 * @author Shogo Akiyama 
 * Solved on 06/04/2020
 * Time: 4m
 * 
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 * difficulty: Easy
 * 
 * Approach: Two Pointers
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 38.1 MB, less than 50.11% of Java online submissions for Remove Element.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the numbers of elements in the array
 * 
 * @see ArrayTest#testRemoveElement()
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int index = 0;

		for (int i : nums) {
			if (i != val) {
				nums[index++] = i;
			}
		}

		return index;
	}

}
