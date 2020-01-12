package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 01/11/2020
 * 
 * 599. Minimum Index Sum of Two Lists
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 * Difficulty: Easy
 * 
 * Approach: 2 Maps
 * Runtime: 12 ms, faster than 25.69% of Java online submissions for Minimum Index Sum of Two Lists.
 * Memory Usage: 39.3 MB, less than 93.55% of Java online submissions for Minimum Index Sum of Two Lists.
 * 
 * Time Complexity: O(n+m)
 * Space Complexity: O(n+m)
 * Where n and m are the numbers of elements in 2 arrays
 * 
 * @see ArrayTest#testMinimumIndexSumOfTwoLists()
 */
public class MinimumIndexSumOfTwoLists {

	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();

		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}

		for (int i = 0; i < list2.length; i++) {
			map2.put(list2[i], i);
		}

		int min = Integer.MAX_VALUE;
		List<String> list = new ArrayList<String>();
		Map<String, Integer> smaller = (map1.size() > map2.size()) ? map2 : map1;
		Map<String, Integer> bigger = (smaller == map1) ? map2 : map1;

		for (Map.Entry<String, Integer> e : smaller.entrySet()) {
			if (bigger.containsKey(e.getKey())) {
				int sum = e.getValue() + bigger.get(e.getKey());
				if (sum == min) {
					list.add(e.getKey());
				} else if (sum < min) {
					min = sum;
					list.clear();
					list.add(e.getKey());
				}
			}
		}

		return list.toArray(new String[0]);
	}

}
