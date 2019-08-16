/**
 * @author Shogo Akiyama 
 * Solved on 08/09/2019
 * 
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int uniquePaths(int m, int n).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
 * Memory Usage: 32.9 MB, less than 5.10% of Java online submissions for Unique Paths.
 * 
 */

public class UniquePaths {

	public int uniquePaths(int m, int n) {
        int moves = m + n - 2;
        int smaller = Math.min(m, n)-1;        
        long result = 1;
        for(int i=smaller; i>0; i--){
            result *= moves-i+1;
            result /= smaller-i+1;
        }
        
        return (int) result;
    }
	
}
