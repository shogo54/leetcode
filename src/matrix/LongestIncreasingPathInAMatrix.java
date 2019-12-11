package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 12/06/2019
 * 
 * 329. Longest Increasing Path in a Matrix
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 * Difficulty: Hard
 * 
 * Approach: DFS & Recursion
 * Runtime: 8 ms, faster than 72.67% of Java online submissions for Longest Increasing Path in a Matrix.
 * Memory Usage: 39.7 MB, less than 97.96% of Java online submissions for Longest Increasing Path in a Matrix.
 * 
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 * Where m * n is the number of elements in a matrix
 * 
 * @see MatrixTest#testLongestIncreasingPathInAMatrix()
 */
public class LongestIncreasingPathInAMatrix {

	private int m;
	private int n;
	private int[][] grid;
	private int[][] seen;
	private int[][] directions;
	private int max;

	public int longestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}

		m = matrix.length;
		n = matrix[0].length;
		grid = matrix;
		seen = new int[m][n];
		directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		max = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				max = Math.max(max, dfs(i, j, 0));
			}
		}

		return max;
	}

	private int dfs(int y, int x, int curr) {
		if (seen[y][x] != 0) {
			return curr + seen[y][x];
		}

		int val = grid[y][x];
		grid[y][x] = Integer.MIN_VALUE;
		int currMax = curr + 1;

		for (int[] next : directions) {
			int ny = y + next[0];
			int nx = x + next[1];
			if (ny >= 0 && ny < m && nx >= 0 && nx < n && grid[ny][nx] > val) {
				currMax = Math.max(currMax, dfs(ny, nx, curr + 1));
			}
		}

		grid[y][x] = val;
		seen[y][x] = Math.max(1, currMax - curr);
		return currMax;
	}

}
