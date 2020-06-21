package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/21/2020
 * 
 * 47. Permutations II
 * https://leetcode.com/problems/permutations-ii/
 * Difficulty: Medium
 * 
 * Approach: Backtracking & String Set
 * Runtime: 5 ms, faster than 29.73% of Java online submissions for Permutations II.
 * Memory Usage: 40.3 MB, less than 46.37% of Java online submissions for Permutations II.
 * 
 * Time Complexity: O(n!)
 * Space Complexity: O(n!)
 * where n is the number of elements in the array
 * 
 * @see ArrayTest#testPermutationsII()
 */
public class PermutationsII {

	private List<List<Integer>> result = new ArrayList<List<Integer>>();
	private Set<String> used = new HashSet<String>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		Queue<Integer> numbers = new ArrayDeque<Integer>();

		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		}

		permute(new ArrayList<Integer>(), "", numbers);
		return result;
	}

	private void permute(List<Integer> list, String rep, Queue<Integer> numbers) {
		if (numbers.size() == 0) {
			result.add(new ArrayList<Integer>(list));
		}

		for (int i = 0; i < numbers.size(); i++) {
			Integer next = numbers.poll();

			if (used.add(rep + next)) {
				list.add(next);
				permute(list, rep + next, numbers);
				list.remove(list.size() - 1);
			}
			numbers.add(next);
		}
	}

}
