/**
 * @author Shogo Akiyama 
 * Solved on 08/13/2019
 * 
 * 73. Set Matrix Zeroes
 * https://leetcode.com/problems/set-matrix-zeroes/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - void setZeroes(int[][] matrix).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Set Matrix Zeroes.
 * Memory Usage: 41.8 MB, less than 97.14% of Java online submissions for Set Matrix Zeroes.
 * 
 */

public class SetMatrixZeroes {

	public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix[0].length];
        int[] column = new int[matrix.length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[j] = 1;
                    column[i] = 1;
                }
            }
        }
        
        for(int k=0; k<row.length; k++){
            if(row[k] == 1){
                for(int c=0; c<matrix.length; c++){
                    matrix[c][k] = 0;
                }
            }
        }
        
        for(int l=0; l<column.length; l++){
            if(column[l] == 1){
                for(int r=0; r<matrix[0].length; r++){
                    matrix[l][r] = 0;
                }
            }
        }
    }
	
}
