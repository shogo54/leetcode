package array;

/**
 * @author Shogo Akiyama 
 * Solved on 04/20/2019
 * 
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
 * Memory Usage: 42.2 MB, less than 21.75% of Java online submissions for Sort Array By Parity.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) except for the output
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testSortArrayByParity()
 */
public class SortArrayByParity {

	public int[] sortArrayByParity(int[] A) {
		int evenIndex = 0;
		int oddIndex = A.length - 1;
		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[evenIndex] = A[i];
				evenIndex++;
			} else {
				result[oddIndex] = A[i];
				oddIndex--;
			}
		}
		return result;
	}

}
