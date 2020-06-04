package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/03/2020
 * Time: 8m
 * 
 * 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 * difficulty: Medium
 * 
 * Approach: Hash Map and Sort
 * Runtime: 6 ms, faster than 96.99% of Java online submissions for Group Anagrams.
 * Memory Usage: 42.3 MB, less than 90.64% of Java online submissions for Group Anagrams.
 * 
 * Time Complexity: O(n * klog(k))
 * Space Complexity: O(n * k)
 * Where n is the numbers of elements in the array and k is the maximum length of a string 
 * 
 * @see ArrayTest#testGroupAnagrams()
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String s : strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<String>());
			}
			map.get(sorted).add(s);
		}

		return new ArrayList<List<String>>(map.values());
	}

}
