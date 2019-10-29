import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/29/2019
 * 
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 * Difficulty: Easy
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
 * Memory Usage: 33.9 MB, less than 7.23% of Java online submissions for Pascal's Triangle.
 * 
 * 
 */
public class PascalsTriangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0; i<numRows; i++){
            if(i==0){
                list.add(Arrays.asList(1));
            }else{
                List<Integer> newList = new ArrayList<Integer>();
                List<Integer> prev = list.get(i-1);
                newList.add(1);
                for(int j=1; j<i; j++){
                    newList.add(prev.get(j-1) + prev.get(j));
                }
                newList.add(1);
                list.add(newList);
            }
        }
        
        return list;
    }
	
}
