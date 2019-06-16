import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/15/2019
 * 
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int majorityElement(int[] nums).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Majority Element.
 * Memory Usage: 41.5 MB, less than 60.72% of Java online submissions for Majority Element.
 * 
 */

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        if(size%2 == 1){
            return nums[size/2];
        }else{
            if(nums[size/2-1] == nums[size/2]){
                return nums[size/2];
            }else{
                if(nums[size/2-1] == nums[0]){
                    return nums[size/2-1];
                }else{
                    return nums[size/2];
                }
            }
        }
    }
	
}