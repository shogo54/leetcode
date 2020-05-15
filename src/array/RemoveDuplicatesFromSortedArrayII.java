package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/14/2020
 * 
 * 80. Remove Duplicates from Sorted Array II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Difficulty: Medium
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array II.
 * Memory Usage: 40 MB, less than 5.26% of Java online submissions for Remove Duplicates from Sorted Array II.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testRemoveDuplicatesFromSortedArrayII()
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return nums.length;
        }
        int prev = nums[0];
        int count = 1;
        int skip = 0;
        for(int i=1; i<nums.length; i++){
            if(prev == nums[i]){
                count++;
                if(count>2){
                    skip++;
                }else{
                    nums[i-skip] = nums[i];
                }
            }else{
                prev = nums[i];
                count = 1;
                nums[i-skip] = nums[i];
            }
        }
        return nums.length - skip;
    }
}
