package array;

/**
 * @author Shogo Akiyama 
 * Solved on 12/19/2019
 * 
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 2 ms, faster than 69.06% of Java online submissions for Squares of a Sorted Array.
 * Memory Usage: 40 MB, less than 99.39% of Java online submissions for Squares of a Sorted Array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testSquaresOfASortedArray()
 */
public class SquaresOfASortedArray {

	public int[] sortedSquares(int[] A) {
		int[] res = new int[A.length];
		int index = 0;
		int right = 0;
		int left = -1;

		while (right < A.length - 1 && A[right] < 0) {
			right++;
			left++;
		}

		while (index < A.length) {
			int val;
			if (left < 0) {
				val = A[right++];
			} else if (right >= A.length) {
				val = A[left--];
			} else if (Math.abs(A[left]) < Math.abs(A[right])) {
				val = A[left--];
			} else {
				val = A[right++];
			}
			res[index++] = val * val;
		}

		return res;
	}

}
