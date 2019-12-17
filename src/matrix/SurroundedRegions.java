package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 12/17/2019
 * 
 * 130. Surrounded Regions
 * https://leetcode.com/problems/surrounded-regions/
 * Difficulty: Medium
 * 
 * Approach: DFS From Edges
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Surrounded Regions.
 * Memory Usage: 40 MB, less than 96.43% of Java online submissions for Surrounded Regions.
 * 
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n) for the recursive stack
 * Where m * n is the number of elements in a board
 * 
 * @see MatrixTest#testSurroundedRegions()
 */
public class SurroundedRegions {

	private int m;
	private int n;
	private char[][] grid;

	public void solve(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return;
		}

		m = board.length;
		n = board[0].length;
		grid = board;

		// dfs from the edges to discover non-flip nodes 'O' -> '-'
		for (int i = 0; i < m; i++) {
			dfs(i, 0);
			dfs(i, n - 1);
		}

		for (int i = 1; i < n - 1; i++) {
			dfs(0, i);
			dfs(m - 1, i);
		}

		// flip all nodes rather than non-flip nodes 'O' -> 'X'
		// change back non-flip nodes '-' -> 'O'
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 'O') {
					grid[i][j] = 'X';
				} else if (grid[i][j] == '-') {
					grid[i][j] = 'O';
				}
			}
		}
	}

	private void dfs(int y, int x) {
		if (y >= 0 && y < m && x >= 0 && x < n && grid[y][x] == 'O') {
			grid[y][x] = '-';

			dfs(y - 1, x);
			dfs(y + 1, x);
			dfs(y, x - 1);
			dfs(y, x + 1);
		}
	}

}
