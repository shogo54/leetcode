package matrix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MatrixTest {
	
	int[][] setupMatrix(){
		return setupMatrix("[[1,2,3],[4,5,6],[7,8,9]]");
	}
	
	int[][] setupMatrix(String str){
		String[] each = str.split("],");
		int[][] matrix = new int[each.length][];
		
		for(int i = 0; i< each.length; i++) {
			String[] nums = each[i].replaceAll("\\[|\\]", "").split(",");
			matrix[i] = new int[nums.length];
			
			for(int j=0; j<nums.length; j++) {
				matrix[i][j] = Integer.valueOf(nums[j]);
			}
		}
		
		return matrix;
	}

	@Test
	void testSpiralMatrix() throws Exception{
		int[][] matrix = setupMatrix();
		assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), new SpiralMatrix().spiralOrder(matrix));
		
		matrix = setupMatrix("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]");
		assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), new SpiralMatrix().spiralOrder(matrix));
	}
	
	@Test
	void testRotateImage() throws Exception{
		int[][] matrix = setupMatrix();
		new RotateImage().rotate(matrix);
		assertArrayEquals(setupMatrix("[[7,4,1],[8,5,2],[9,6,3]]"), matrix);
		
		matrix = setupMatrix("[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]");
		new RotateImage().rotate(matrix);
		assertArrayEquals(setupMatrix("[[13,9,5,1],[14,10,6,2],[15,11,7,3],[16,12,8,4]]"), matrix);
	}
	
	@Test
	void testPacificAtlanticWaterFlow() throws Exception{
		int[][] matrix = setupMatrix("[[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]");
		int[][] array = new int[][]{{0,4},{1,3},{1,4},{2,2},{3,0},{3,1},{4,0}};
		List<List<Integer>> expected = new LinkedList<List<Integer>>();
		for(int[] yx: array) {
			expected.add(Arrays.asList(yx[0], yx[1]));
		}
		assertEquals(expected, new PacificAtlanticWaterFlow().pacificAtlantic(matrix));
	}
	
	@Test
	void testNumberOfIslands() throws Exception{
		char[][] grid = new char[][] {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
		assertEquals(1, new NumberOfIslands().numIslands(grid));
		
		grid = new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		assertEquals(3, new NumberOfIslands().numIslands(grid));
	}
	
	@Test
	void testSetMatrixZeroes() throws Exception{
		int[][] matrix = setupMatrix("[[1,1,1],[1,0,1],[1,1,1]]");
		new SetMatrixZeroes().setZeroes(matrix);;
		assertArrayEquals(setupMatrix("[[1,0,1],[0,0,0],[1,0,1]]"), matrix);
		
		matrix = setupMatrix("[[0,1,2,0],[3,4,5,2],[1,3,1,5]]");
		new SetMatrixZeroes().setZeroes(matrix);;
		assertArrayEquals(setupMatrix("[[0,0,0,0],[0,4,5,0],[0,3,1,0]]"), matrix);
	}

}
