package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 12/18/2019
 * 
 * 289. Game of Life
 * https://leetcode.com/problems/game-of-life/
 * Difficulty: Medium
 * 
 * Approach: In-place (Optimized)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
 * Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Game of Life.
 * 
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 * Where m * n is the number of elements in a matrix
 * 
 * @see MatrixTest#testGameOfLife()
 */
public class GameOfLife {

	private int[][] grid;
	private int m;
	private int n;
	private int[][] directions = new int[][] {
		{ -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }, // horizontal and vertical
		{ -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } // diagonal
	};

	public void gameOfLife(int[][] board) {
		if (board == null || board.length == 0) {
			return;
		}

		grid = board;
		m = board.length;
		n = board[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				signal(i, j);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				update(i, j);
			}
		}
	}

	// each alive cell sends signals to adjacent nodes by adding 10 to their values
	private void signal(int y, int x) {
		if (grid[y][x] % 10 == 1) {
			for (int[] dir : directions) {
				int ny = y + dir[0];
				int nx = x + dir[1];
				if (ny >= 0 && ny < m && nx >= 0 && nx < n) {
					grid[ny][nx] += 10;
				}
			}
		}
	}

	// each cell counts the number of signals received (grid[y][x]/10)
	// then decide if they will be alive or dead
	private void update(int y, int x) {
		int neighbors = grid[y][x] / 10;
		if (grid[y][x] % 10 == 1) {
			if (neighbors < 2) {
				grid[y][x] = 0;
			} else if (neighbors < 4) {
				grid[y][x] = 1;
			} else {
				grid[y][x] = 0;
			}
		} else {
			if (neighbors == 3) {
				grid[y][x] = 1;
			} else {
				grid[y][x] = 0;
			}
		}
	}
	
}
