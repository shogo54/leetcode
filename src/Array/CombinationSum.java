package Array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/29/2019
 * 
 * 39. Combination Sum
 * https://leetcode.com/problems/combination-sum/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - List<List<Integer>> combinationSum(int[] candidates, int target)
 * - void combine(int[] cands, int t, List<Integer> sofar, int last).
 * 
 * Runtime: 4 ms, faster than 66.51% of Java online submissions for Combination Sum.
 * Memory Usage: 39.1 MB, less than 28.15% of Java online submissions for Combination Sum.
 * 
 */

public class CombinationSum {

	private Set<List<Integer>> result = new HashSet<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		combine(candidates, target, new ArrayList<Integer>(), 0);
		return new ArrayList<List<Integer>>(result);
	}

	private void combine(int[] cands, int t, List<Integer> sofar, int last) {
		if (t == 0) {
			result.add(new ArrayList<Integer>(sofar));
			return;
		}
		for (int i=last; i<cands.length; i++) {
			if (t - cands[i] >= 0) {
				sofar.add(cands[i]);
				combine(cands, t - cands[i], sofar, i);
				sofar.remove(sofar.size() - 1);
			}
		}
	}

}
