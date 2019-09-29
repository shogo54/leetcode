package Matrix;

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

}
