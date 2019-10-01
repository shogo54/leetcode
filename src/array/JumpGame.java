package array;

/**
 * @author Shogo Akiyama 
 * Solved on 08/23/2019
 * 
 * 55. Jump Game
 * https://leetcode.com/problems/jump-game/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - boolean canJump(int[] nums).
 * 
 * Runtime: 1 ms, faster than 99.26% of Java online submissions for Jump Game.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Jump Game.
 * 
 */

public class JumpGame {
	
	public boolean canJump(int[] nums) {
		int prevZeros = 0;
		for(int i=nums.length-2; i>=0; i--) {
			if(nums[i] == 0) {
				prevZeros++;
			}else{
				if(nums[i] > prevZeros) {
					prevZeros = 0;
				}else {
					prevZeros++;
				}
			}
		}
		
		return (prevZeros == 0);
	}
	
}
