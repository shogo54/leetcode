package matrix;

/**
 * @author Shogo Akiyama 
 * Solved on 10/28/2019
 * 
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 * Difficulty: Medium
 * 
 * Approach: DFS
 * Runtime: 2 ms, faster than 90.49% of Java online submissions for Valid Sudoku.
 * Memory Usage: 42.9 MB, less than 97.10% of Java online submissions for Valid Sudoku.
 * 
 * @see MatrixTest#testValidSudoku()
 */
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		int[][] horizontal = new int[9][9];
		int[][] vertical = new int[9][9];
		int[][] subbox = new int[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c != '.') {
					int val = Character.getNumericValue(c) - 1;
					if (++horizontal[i][val] > 1) {
						return false;
					} else if (++vertical[j][val] > 1) {
						return false;
					} else if (++subbox[(i / 3) * 3 + (j / 3)][val] > 1) {
						return false;
					}
				}
			}
		}

		return true;
	}

}
