package array;

/**
 * @author Shogo Akiyama 
 * Solved on 12/02/2019
 * 
 * 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Difficulty: Medium
 * 
 * Approach: Binary Search & Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
 * Memory Usage: 43.5 MB, less than 97.16% of Java online submissions for Find First and Last Position of Element in Sorted Array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of nodes in the array
 * 
 * @see ArrayTest#testFindFirstAndLastPositionOfElementInSortedArray()
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
	
	public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[]{-1,-1};
        int lo = 0;
        int hi = len - 1;
        
        while(lo <= hi){
            int m = (hi + lo) / 2;
            int val = nums[m];
            
            if(val == target){
                result[0] = m;
                result[1] = m;
                break;
            }else if(val < target){
                lo = m+1;
            }else{
                hi = m-1;
            }
        }
        
        if(result[0] != -1){
            while(result[0] > 0 && nums[result[0]-1] == target){
                result[0]--;
            }
            while(result[1] < len-1 && nums[result[1]+1] == target){
                result[1]++;
            }
        }
        
        return result;
    }
	
}
