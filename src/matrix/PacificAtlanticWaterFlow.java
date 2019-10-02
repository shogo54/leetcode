package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/02/2019
 * 
 * 417. Pacific Atlantic Water Flow
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 * Difficulty: Medium
 * 
 * Approach: DFS from Ocean
 * Runtime: 4 ms, faster than 97.58% of Java online submissions for Pacific Atlantic Water Flow.
 * Memory Usage: 45.4 MB, less than 14.29% of Java online submissions for Pacific Atlantic Water Flow.
 * 
 */

public class PacificAtlanticWaterFlow {

	private int[][] mat;
	private int m;
	private int n;
	private int[][] xys = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		if (matrix.length == 0) {
			return new ArrayList<List<Integer>>();
		}

		mat = matrix;
		m = matrix.length;
		n = matrix[0].length;
		boolean[][] pac = new boolean[m][n];
		boolean[][] atl = new boolean[m][n];
		List<List<Integer>> list = new LinkedList<List<Integer>>();

		// vertical borders
		for (int i = 0; i < m; i++) {
			pac[i][0] = true;
			atl[i][n - 1] = true;
		}

		// horizontal borders
		for (int j = 0; j < n; j++) {
			pac[0][j] = true;
			atl[m - 1][j] = true;
		}

		// dfs for vertical borders
		for (int i = 0; i < m; i++) {
			dfs(pac, i, 0);
			dfs(atl, i, n - 1);
		}

		// dfs for horizontal borders
		for (int j = 0; j < n; j++) {
			dfs(pac, 0, j);
			dfs(atl, m - 1, j);
		}

		// add y-x pairs with both pac[y][x] and atl[y][x]
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (pac[i][j] && atl[i][j]) {
					list.add(Arrays.asList(i, j));
				}
			}
		}

		return list;
	}

	private void dfs(boolean[][] board, int y, int x) {
		int h = mat[y][x];

		for (int[] xy : xys) {
			int y2 = y + xy[0];
			int x2 = x + xy[1];
			if (y2 >= 0 && y2 < m && x2 >= 0 && x2 < n && h <= mat[y2][x2] && board[y2][x2] == false) {
				board[y2][x2] = true;
				dfs(board, y2, x2);
			}
		}
	}

}
