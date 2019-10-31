package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/27/2019
 * 
 * 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/ 
 * Difficulty: Medium
 * 
 * Approach: Map & Reverse
 * Runtime: 13 ms, faster than 70.89% of Java online submissions for Top K Frequent Elements. 
 * Memory Usage: 40.8 MB, less than 56.03% of Java online submissions for Top K Frequent Elements.
 * 
 * @see ArrayTest#testTopKFrequentElements()
 */
public class TopKFrequentElements {

	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Map<Integer, Set<Integer>> reverse = new TreeMap<Integer, Set<Integer>>(Collections.reverseOrder());
		List<Integer> list = new LinkedList<Integer>();

		for (int n : nums) {
			count.put(n, count.getOrDefault(n, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if (!reverse.containsKey(entry.getValue())) {
				reverse.put(entry.getValue(), new HashSet<Integer>());
			}
			reverse.get(entry.getValue()).add(entry.getKey());
		}

		for (Set<Integer> set : reverse.values()) {
			list.addAll(set);
			k -= set.size();
			if (k == 0) {
				break;
			}
		}

		return list;
	}

}
