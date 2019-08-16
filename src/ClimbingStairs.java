/**
 * @author Shogo Akiyama 
 * Solved on 08/14/2019
 * 
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int climbStairs(int n).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 * Memory Usage: 32.7 MB, less than 5.26% of Java online submissions for Climbing Stairs.
 * 
 */

public class ClimbingStairs {

	public int climbStairs(int n) {
        int[] steps = new int[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i=2; i<=n; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }
	
}
