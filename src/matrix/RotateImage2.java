package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 05/24/2020
 * 
 * 48. Rotate Image
 * https://leetcode.com/problems/rotate-image/
 * Difficulty: Medium
 * 
 * Approach: Two Reverses
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
 * Memory Usage: 39.4 MB, less than 5.77% of Java online submissions for Rotate Image.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Where n is the side length of the matrix
 * 
 * @see MatrixTest#testRotateImage()
 */
public class RotateImage2 {

	public void rotate(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
				matrix[n - 1 - j][n - 1 - i] = temp;
			}
		}
	}

}
