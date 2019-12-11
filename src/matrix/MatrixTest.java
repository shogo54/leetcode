package matrix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	/**
	 * Test cases for 36. Valid Sudoku
	 * 
	 * @see ValidSudoku
	 */
	@Test
	void testValidSudoku() {
		char[][] sudoku = setupCharMatrix(new String[] { "53..7....", "6..195...", ".98....6.", "8...6...3",
				"4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79" });

		assertTrue(new ValidSudoku().isValidSudoku(sudoku));

		sudoku[0][4] = '2';
		assertFalse(new ValidSudoku().isValidSudoku(sudoku));

		sudoku[0][4] = '3';
		assertFalse(new ValidSudoku().isValidSudoku(sudoku));

		sudoku[0][4] = '5';
		assertFalse(new ValidSudoku().isValidSudoku(sudoku));
	}

	/**
	 * Test cases for 48. Rotate Image
	 * 
	 * @see RotateImage
	 */
	@Test
	void testRotateImage() {
		int[][] matrix = setupMatrix();
		new RotateImage().rotate(matrix);
		assertArrayEquals(setupMatrix("[[7,4,1],[8,5,2],[9,6,3]]"), matrix);

		matrix = setupMatrix("[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]");
		new RotateImage().rotate(matrix);
		assertArrayEquals(setupMatrix("[[13,9,5,1],[14,10,6,2],[15,11,7,3],[16,12,8,4]]"), matrix);
	}

	/**
	 * Test cases for 54. Spiral Matrix
	 * 
	 * @see SpiralMatrix
	 */
	@Test
	void testSpiralMatrix() {
		int[][] matrix = setupMatrix();
		assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), new SpiralMatrix().spiralOrder(matrix));

		matrix = setupMatrix("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]");
		assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), new SpiralMatrix().spiralOrder(matrix));
	}

	/**
	 * Test cases for 64. Minimum Path Sum
	 * 
	 * @see MinimumPathSum
	 */
	@Test
	void testMinimumPathSum() {
		int[][] matrix = setupMatrix();
		assertEquals(21, new MinimumPathSum().minPathSum(matrix));

		matrix = setupMatrix("[[1,3,1],[1,5,1],[4,2,1]]");
		assertEquals(7, new MinimumPathSum().minPathSum(matrix));
	}

	/**
	 * Test cases for 73. Set Matrix Zeroes
	 * 
	 * @see SetMatrixZeroes
	 */
	@Test
	void testSetMatrixZeroes() {
		int[][] matrix = setupMatrix("[[1,1,1],[1,0,1],[1,1,1]]");
		new SetMatrixZeroes().setZeroes(matrix);
		assertArrayEquals(setupMatrix("[[1,0,1],[0,0,0],[1,0,1]]"), matrix);

		matrix = setupMatrix("[[0,1,2,0],[3,4,5,2],[1,3,1,5]]");
		new SetMatrixZeroes().setZeroes(matrix);
		assertArrayEquals(setupMatrix("[[0,0,0,0],[0,4,5,0],[0,3,1,0]]"), matrix);
	}

	/**
	 * Test cases for 79. Word Search
	 * 
	 * @see WordSearch
	 */
	@Test
	void testWordSearch() {
		char[][] grid = setupCharMatrix(new String[] { "ABCE", "SFCS", "ADEE" });
		assertTrue(new WordSearch().exist(grid, "ABCCED"));
		assertTrue(new WordSearch().exist(grid, "SEE"));
		assertFalse(new WordSearch().exist(grid, "ABCB"));
	}

	/**
	 * Test cases for 200. Number of Islands
	 * 
	 * @see NumberOfIslands
	 */
	@Test
	void testNumberOfIslands() {
		char[][] grid = setupCharMatrix(new String[] { "111", "010", "111" });
		assertEquals(1, new NumberOfIslands().numIslands(grid));

		grid = setupCharMatrix(new String[] { "11000", "11000", "00100", "00011" });
		assertEquals(3, new NumberOfIslands().numIslands(grid));
	}

	/**
	 * Test cases for 212. Word Search II
	 * 
	 * @see WordSearchII
	 */
	@Test
	void testWordSearchII() {
		char[][] grid = setupCharMatrix(new String[] { "oaan", "etae", "ihkr", "iflv" });
		List<String> expected = Arrays.asList("oath", "eat");
		List<String> actual = new WordSearchII().findWords(grid, new String[] { "oath", "pea", "eat", "rain" });
		assertEquals(new HashSet<String>(expected), new HashSet<String>(actual));
		assertEquals(expected.size(), actual.size());

		grid = setupCharMatrix(new String[] { "ab", "aa" });
		expected = Arrays.asList("aaa", "aaab", "aaba", "aba", "baa");
		actual = new WordSearchII().findWords(grid,
				new String[] { "aba", "baa", "bab", "aaab", "aaa", "aaaa", "aaba" });
		assertEquals(new HashSet<String>(expected), new HashSet<String>(actual));
		assertEquals(expected.size(), actual.size());
	}

	/**
	 * Test cases for 329. Longest Increasing Path in a Matrix
	 * 
	 * @see LongestIncreasingPathInAMatrix
	 */
	@Test
	void testLongestIncreasingPathInAMatrix() {
		int[][] matrix = setupMatrix("[[9,9,4],[6,6,8],[2,1,1]]");
		assertEquals(4, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[[3,4,5],[3,2,6],[2,2,1]]");
		assertEquals(4, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[]");
		assertEquals(0, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[[1]]");
		assertEquals(1, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[[4,3,2]]");
		assertEquals(3, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[[1],[3],[5]]");
		assertEquals(3, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));

		matrix = setupMatrix("[[1,6,12,1,3],[8,4,6,10,5],[12,11,7,12,2],[2,3,4,1,13],[14,6,0,14,13]]");
		assertEquals(6, new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));
	}

	/**
	 * Test cases for 417. Pacific Atlantic Water Flow
	 * 
	 * @see PacificAtlanticWaterFlow
	 */
	@Test
	void testPacificAtlanticWaterFlow() {
		int[][] matrix = setupMatrix("[[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]");
		int[][] array = new int[][] { { 0, 4 }, { 1, 3 }, { 1, 4 }, { 2, 2 }, { 3, 0 }, { 3, 1 }, { 4, 0 } };
		List<List<Integer>> expected = new LinkedList<List<Integer>>();
		for (int[] yx : array) {
			expected.add(Arrays.asList(yx[0], yx[1]));
		}
		assertEquals(expected, new PacificAtlanticWaterFlow().pacificAtlantic(matrix));
	}

	int[][] setupMatrix() {
		return setupMatrix("[[1,2,3],[4,5,6],[7,8,9]]");
	}

	int[][] setupMatrix(String str) {
		String[] each = str.split("],");
		int[][] matrix = new int[each.length][];

		for (int i = 0; i < each.length; i++) {
			String[] nums = each[i].replaceAll("\\[|\\]", "").split(",");
			matrix[i] = new int[nums.length];

			for (int j = 0; j < nums.length; j++) {
				matrix[i][j] = Integer.valueOf(nums[j]);
			}
		}

		return matrix;
	}

	char[][] setupCharMatrix(String[] strs) {
		char[][] grid = new char[strs.length][];
		for (int i = 0; i < strs.length; i++) {
			grid[i] = strs[i].toCharArray();
		}
		return grid;
	}

}
