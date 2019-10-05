package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/04/2019
 * 
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 * Difficulty: Medium
 * 
 * Approach: DFS
 * Runtime: 24 ms, faster than 5.25% of Java online submissions for Number of Islands.
 * Memory Usage: 42.2 MB, less than 21.40% of Java online submissions for Number of Islands.
 * 
 */

public class NumberOfIslands {

	private char[][] board;
	private int h;
	private int w;
	private Set<String> seen = new HashSet<String>();;
	private int[][] xys = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		board = grid;
		h = grid.length;
		w = grid[0].length;

		int count = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!seen.contains(i + "-" + j)) {
					if (board[i][j] == '1') {
						count++;
						find(i, j);
					}
				}

			}
		}
		return count;
	}

	private void find(int y, int x) {
		seen.add(y + "-" + x);

		for (int i = 0; i < xys.length; i++) {
			int ny = y + xys[i][0];
			int nx = x + xys[i][1];

			if (ny >= 0 && ny < h && nx >= 0 && nx < w && !seen.contains(ny + "-" + nx) && board[ny][nx] == '1') {
				find(ny, nx);
			}
		}
	}

}
