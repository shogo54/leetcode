package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 09/29/2019
 * 
 * 48. Rotate Image
 * https://leetcode.com/problems/rotate-image/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - void rotate(int[][] matrix).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
 * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Rotate Image.
 * 
 */

public class RotateImage {

	public void rotate(int[][] matrix) {
		int s = 0;
		int e = matrix.length - 1;

		while (s <= e) {
			int[] keep = new int[e - s];
			int index = 0;

			for (int i = 0; i < e - s; i++) {
				keep[index] = matrix[s][s + i];
				matrix[s][s + i] = matrix[e - i][s];
				matrix[e - i][s] = matrix[e][e - i];
				matrix[e][e - i] = matrix[s + i][e];
				matrix[s + i][e] = keep[index];
				index++;
			}

			s++;
			e--;
		}
	}

}
