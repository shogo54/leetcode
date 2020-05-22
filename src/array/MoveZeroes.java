package array;

/**
 * @author Shogo Akiyama 
 * Solved on 06/15/2019
 * 
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
 * Memory Usage: 36.3 MB, less than 99.98% of Java online submissions for Move Zeroes.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testMoveZeros()
 */
public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
            }
            if(nums[i] != 0){
                i++;
            }
            j++;
        }
    }
	
}