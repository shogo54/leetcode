package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/22/2019
 * 
 * 54. Spiral Matrix
 * https://leetcode.com/problems/spiral-matrix/
 * Difficulty: Medium
 * 
 * Approach: Layer by Layer & Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
 * Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Spiral Matrix.
 * 
 */

public class SpiralMatrix {


    List<Integer> list = new ArrayList<Integer>();
    int row;
    int column;
    
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return list;
        }
        row = matrix.length;
        column = matrix[0].length;
        goAround(matrix, 0);
        return list;
    }
    
    private void goAround(int[][] m, int count){
        if((column - 1 < count * 2) && (row - 1 < count * 2)){
            return;
        }
              
        for(int i=count; i<column-count-1; i++){
            list.add(m[count][i]);
        }
        
        for(int i=count; i<row-count; i++){
            list.add(m[i][column-1-count]);
        }
        
        if((column - 1 <= count * 2) || (row - 1 <= count * 2)){
            return;
        }
        
        for(int i=column-2-count; i>=count+1; i--){
            list.add(m[row-1-count][i]);
        }
        
        for(int i=row-1-count; i>=count+1; i--){
            list.add(m[i][count]);
        }
        
        if((column - 1 - count == count+1) || row - 1 - count == count + 1){
            return;
        }
        
        goAround(m, count+1);
    }
	
}
